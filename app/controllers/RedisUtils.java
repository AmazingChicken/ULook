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

public class RedisUtils{


  public String checkToken(Jedis conn, String token) {
    return conn.hget("login:", token);
  }


  public void updateToken(Jedis conn, String token, String user, String item) {
    long timestamp = System.currentTimeMillis() / 1000;
    conn.hset("login:", token, user);
    conn.zadd("recent:", timestamp, token);
    if (item != null) {
        conn.zadd("viewed:" + token, timestamp, item);
        conn.zremrangeByRank("viewed:" + token, 0, -26);
        conn.zincrby("viewed:", -1, item);
    }
  }


  public void addToCart(Jedis conn, String session, String item, int count) {
    if (count <= 0) {
        conn.hdel("cart:" + session, item);
    } else {
        conn.hset("cart:" + session, item, String.valueOf(count));
    }
  }


  public void scheduleRowCache(Jedis conn, String rowId, int delay) {
    conn.zadd("delay:", delay, rowId);
    conn.zadd("schedule:", System.currentTimeMillis() / 1000, rowId);
  }
  

}
