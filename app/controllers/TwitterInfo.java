package controllers;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import javax.print.attribute.standard.Media;
import javax.security.auth.login.Configuration;

import java.util.HashMap;
import java.util.List;

public class TwitterInfo {

    public HashMap<String,String> getTweets() throws TwitterException {

        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey("7NUs0DfwcM1emWOtkJEKIGATE")
                .setOAuthConsumerSecret("ovgSKMELlpnppFWXIBJaBAkqwGhinrwicJsq5CpZhYhdy5iaOA")
                .setOAuthAccessToken("2464012904-5qdNMqrt2OMIMVFND6RnNCjt0Hmz3ad5ZR62NgL")
                .setOAuthAccessTokenSecret("zgpq3viNB1WbhFSycA1EVyhjwexeRvtro1sT88qU4hwoT");

        TwitterFactory tf = new TwitterFactory(configurationBuilder.build());
        twitter4j.Twitter twitter = tf.getInstance();
        Query query = new Query("#OOTD");
        query.setResultType(Query.RECENT);
        query.setCount(100);
        QueryResult results = twitter.search(query);
        HashMap<String,String> pics = new HashMap<String,String>();

        List<twitter4j.Status> tweets = results.getTweets();
        
        for(Status tweet : tweets) {

            MediaEntity[] picture = tweet.getMediaEntities();
            
            for(MediaEntity url : picture) {

                pics.put(url.getMediaURL(),tweet.getUser().getScreenName());
                
            }

        }

        return pics;
    }

}
