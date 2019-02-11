package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Random;
import redis.clients.jedis.Jedis;


public class CleanSessionsThread extends Thread {
    private Jedis conn;
    private int limit = 10000;
    private boolean quit ;

    public CleanSessionsThread(int limit) {
        this.conn = new Jedis("localhost");
        this.conn.select(14);
        this.limit = limit;
    }

    public void quit() {
        quit = true;
    }

    public void run() {
        while (!quit) {
            long size = conn.zcard("recent:");
            if (size <= limit) {
                try {
                    sleep(1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                continue;
            }

            long endIndex = Math.min(size - limit, 100);
            Set<String> tokenSet = conn.zrange("recent:", 0, endIndex - 1);
            String[] tokens = tokenSet.toArray(new String[tokenSet.size()]);

            ArrayList<String> sessionKeys = new ArrayList<String>();
            for (String token : tokens) {
                sessionKeys.add("viewed:" + token);
            }
            conn.del(sessionKeys.toArray(new String[sessionKeys.size()]));
            conn.hdel("login:", tokens);
            conn.zrem("recent:", tokens);
        }
    }
}
