package controllers;


import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import org.postgresql.util.PSQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.UUID;

public class DBUtil {

    private final String DBURL = "jdbc:postgresql://localhost/playdb";  // CHANGE PORT TO 5432 BY DEFAULT
    private final String DBUSER = "postgres";
    private final String DBPASSWORD = " ";                           // CHANGE PASSWOR
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private int favouriteNum;


    public DBUtil() {
        Properties props = new Properties();
        props.setProperty("user", DBUSER);
        props.setProperty("password", DBPASSWORD);
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DBURL, props);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    // feel free to test your local database
    public static void main(String[] args) throws Exception {
        String itemName = "ee2ew";
        String itemBrand = "asqwasd";
        String itemType = "x213qweqwqwdqwdc";
        String itemCategory = "qwewqw";
        String itemPrice = "sdcwqed";
        String itemPicture = "";
        //addItem(itemName, itemBrand, itemType, itemCategory, itemPrice, itemPicture);


        try {
            //addFavourite("linjj2yy",itemName,itemBrand,itemType,itemCategory,itemPrice,itemPicture);
            addOutfit("3","1","3","4","5");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ArrayList<Outfit> outfitList = getOutfitBy("3"
            );
            for(Outfit outfit: outfitList){
                System.out.println(outfit.getHat());
            }
            //ßSystem.out.println(item.itemPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //add user into the database (for sign up)
    public static void addUser(String account, String password){
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        //System.out.println("asdasdas");
        try {
            //ps = conn.prepareStatement("SELECT * FROM \"Login\"");
            ps = conn.prepareStatement(
                    "INSERT INTO \"Login\" (\"username\", \"password\") " +
                            "VALUES (?, ?)");
            ps.setString(1, account);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("username"));
            }
            //System.out.println("asdasdas");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
    }

    //check whether exists an account with the password
    public static boolean checkUser(String account,String password) throws SQLException {
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
                ps = conn.prepareStatement("SELECT * FROM \"Login\" WHERE \"username\"=?");
                ps.setString(1, account);
                rs = ps.executeQuery();

            if (rs.next()) {
                if(account.equals(rs.getString("userName")) && password.equals(rs.getString("password"))){
                    return true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
        return false;
    }

    //add one item to the database
    public static void addItem(String itemName, String itemBrand, String itemType, String itemCategory, String itemPrice,String itemPic){
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(
                    "INSERT INTO \"Data\" (\"name\", \"brand\", \"type\", \"category\", \"price\", \"picture\") " +
                            "VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, itemName);
            ps.setString(2, itemBrand);
            ps.setString(3, itemType);
            ps.setString(4, itemCategory);
            ps.setString(5, itemPrice);
            ps.setString(6, itemPic);

            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("username"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
    }

    //get item (for search) ; there are five types: name, brand, type, category, price
    public static ArrayList<Item> getItemBy(String type, String value) throws Exception {
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Item item = null;
        ArrayList<Item> arrList= new ArrayList<Item>();

        try {
            if (type.equals("name")) {
                ps = conn.prepareStatement("SELECT * FROM \"Data\" WHERE \"name\"=?");
            } else if (type.equals("brand")){
                ps = conn.prepareStatement("SELECT * FROM \"Data\" WHERE \"brand\"=?");
            } else if (type.equals("type")){
                ps = conn.prepareStatement("SELECT * FROM \"Data\" WHERE \"type\"=?");
            } else if (type.equals("category")){
                ps = conn.prepareStatement("SELECT * FROM \"Data\" WHERE \"category\"=?");
            } else{
                ps = conn.prepareStatement("SELECT * FROM \"Data\" WHERE \"price\"=?");
            }

            ps.setString(1, value);
            rs = ps.executeQuery();

            while (rs.next()) {
                item = new Item("ok", "ok");
                item.setName(rs.getString("name"));
                item.setBrand(rs.getString("brand"));
                item.setAType(rs.getString("type"));
                item.setCategory(rs.getString("category"));
                item.setPrice(rs.getString("price"));
                item.setPicture(rs.getString("picture"));
                //System.out.println(rs.getString("name"));
               //System.out.println("qweqweq");
                arrList.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
        return arrList;
    }

    //add Item to the user's favourtite
    public static void addFavourite(String username, String itemName, String itemBrand, String itemType, String itemCategory, String itemPrice,String itemPic) throws Exception {
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        //String id = generateUUID();
        try {

            ps = conn.prepareStatement(
                    "INSERT INTO \"Favourite\" (\"username\", \"name\", \"brand\", \"type\", \"category\", \"price\", \"picture\") " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, username);
            ps.setString(2, itemName);
            ps.setString(3, itemBrand);
            ps.setString(4, itemType);
            ps.setString(5, itemCategory);
            ps.setString(6, itemPrice);
            ps.setString(7, itemPic);

            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
    }

    // get the user's favourite according to the username
    public static ArrayList<Item> getFavouriteBy(String username) throws Exception {
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Item item = null;
        ArrayList<Item> arrList= new ArrayList<Item>();

        try {
                ps = conn.prepareStatement("SELECT * FROM \"Favourite\" WHERE \"username\"=?");

            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                item = new Item("1","1");
                item.setName(rs.getString("name"));
                item.setBrand(rs.getString("brand"));
                item.setAType(rs.getString("type"));
                item.setCategory(rs.getString("category"));
                item.setPrice(rs.getString("price"));
                item.setPicture(rs.getString("picture"));
                //System.out.println(rs.getString("name"));
                //System.out.println("qweqweq");
                arrList.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
        return arrList;
    }

    //generate key (I used it to generate "id" for addOutfit)
    public static String generateUUID() throws Exception {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        return randomUUIDString;
    }

    //add the outfit into database, the first parameter is username, others are the name of the item.
    public static void addOutfit(String username, String hat, String top, String bottom, String shoe) throws Exception {
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String id = generateUUID();
        try {

            ps = conn.prepareStatement(
                    "INSERT INTO \"Outfits\" (\"id\", \"username\", \"hat\", \"top\", \"bottom\", \"shoe\") " +
                            "VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, id);
            ps.setString(2, username);
            ps.setString(3, hat);
            ps.setString(4, top);
            ps.setString(5, bottom);
            ps.setString(6, shoe);

            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("username"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
    }

    //get arraylist of outfit according to the username
    public static ArrayList<Outfit> getOutfitBy(String username) throws Exception {
        DBUtil dbUtils = new DBUtil();
        Connection conn = dbUtils.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Outfit outfit = null;
        ArrayList<Outfit> outfitList = new ArrayList<Outfit>();

        try {
                ps = conn.prepareStatement("SELECT * FROM \"Outfits\" WHERE \"username\"=?");

            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                outfit = new Outfit("1","1","1","1","1","1");
                outfit.setHat(rs.getString("hat"));
                outfit.setTop(rs.getString("top"));
                outfit.setBottom(rs.getString("bottom"));
                outfit.setShoes(rs.getString("shoe"));
                outfit.setUserName(rs.getString("username"));

                //System.out.println(rs.getString("name"));
                //System.out.println("qweqweq");
                outfitList.add(outfit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.close();
        }
        return outfitList;
    }
    
    public static void addDb() throws SQLException, URISyntaxException, IOException{
      	 Webhose webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:jacket OR name:top OR name:shirt)");
           webhoseData.pullData();
           JsonArray postArray = webhoseData.getData();
           
           //Add asos shirts
           for(JsonElement o  : postArray) {
               String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
               String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
               String productPrice = (o.getAsJsonObject().get("price").getAsString());   
               String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
               addItem(productName, productBrand, "Shirt", "Shirt", productPrice, productImage);
           } 
           //Hats
      	 webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:headwear OR name:hat OR name:cap)");
           webhoseData.pullData();
           postArray = webhoseData.getData();
           for(JsonElement o  : postArray) {
               String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
               String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
               String productPrice = (o.getAsJsonObject().get("price").getAsString());   
               String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
               addItem(productName, productBrand, "Hat", "Hat", productPrice, productImage);
           } 
           //Pants
      	 webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:jeans OR name:pants OR name:trousers)");
           webhoseData.pullData();
           postArray = webhoseData.getData();
           for(JsonElement o  : postArray) {
               String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
               String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
               String productPrice = (o.getAsJsonObject().get("price").getAsString());   
               String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
               addItem(productName, productBrand, "Pants", "Pants", productPrice, productImage);
           } 
           //Shoes
      	 webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:Shoe OR name:Trainers OR name:sneakers)");
           webhoseData.pullData();
           postArray = webhoseData.getData();
           for(JsonElement o  : postArray) {
               String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
               String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
               String productPrice = (o.getAsJsonObject().get("price").getAsString());   
               String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
               addItem(productName, productBrand, "Shoes", "Shoes", productPrice, productImage);
           } 
      }
    
    public static void addShirts() throws SQLException, URISyntaxException, IOException{

          Webhose webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:jacket OR name:top OR name:shirt)");
          webhoseData.pullData();
          JsonArray postArray = webhoseData.getData();
          for(JsonElement o  : postArray) {
              String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
              String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
              String productPrice = (o.getAsJsonObject().get("price").getAsString());   
              String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
              addItem(productName, productBrand, "Shoes", "Shoes", productPrice, productImage);
          } 
     }
    public static void addHats() throws SQLException, URISyntaxException, IOException{

         Webhose webhoseData  = new Webhose("(site:asos.com OR theiconic.com.au)(name:headwear OR name:hat OR name:cap)");
         webhoseData.pullData();
         JsonArray postArray = webhoseData.getData();
         for(JsonElement o  : postArray) {
             String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
             String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
             String productPrice = (o.getAsJsonObject().get("price").getAsString());   
             String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
             addItem(productName, productBrand, "Shoes", "Shoes", productPrice, productImage);
         } 
    }
    public static void addPants() throws SQLException, URISyntaxException, IOException{
    
         Webhose webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:jeans OR name:pants OR name:trousers)");
         webhoseData.pullData();
         JsonArray postArray = webhoseData.getData();
         for(JsonElement o  : postArray) {
             String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
             String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
             String productPrice = (o.getAsJsonObject().get("price").getAsString());   
             String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
             addItem(productName, productBrand, "Shoes", "Shoes", productPrice, productImage);
         } 
    }
    public static void addShoes() throws SQLException, URISyntaxException, IOException{

        Webhose webhoseData = new Webhose("(site:asos.com OR theiconic.com.au)(name:Shoe OR name:Trainers OR name:sneakers)");
        webhoseData.pullData();
        JsonArray postArray = webhoseData.getData();
        for(JsonElement o  : postArray) {
            String productName = (o.getAsJsonObject().get("name").getAsString());  // Print title
            String productBrand = (o.getAsJsonObject().get("brand").getAsString()); // Print author
            String productPrice = (o.getAsJsonObject().get("price").getAsString());   
            String productImage = (o.getAsJsonObject().get("images").getAsString());// Print language
            
            addItem(productName, productBrand, "Shoes", "Shoes", productPrice, saveImage(productImage,productName));
        } 
   }
    public static String saveImage(String source, String name) throws IOException{
    	 URL url = new URL(source);
    	 InputStream in = new BufferedInputStream(url.openStream());
    	 ByteArrayOutputStream out = new ByteArrayOutputStream();
    	 byte[] buf = new byte[1024];
    	 int n = 0;
    	 while (-1!=(n=in.read(buf)))
    	 {
    	    out.write(buf, 0, n);
    	 }
    	 out.close();
    	 in.close();
    	 byte[] response = out.toByteArray();
    	 String path = "public/products/"+name+".jpg";
    	 FileOutputStream fos = new FileOutputStream(path);
    	 fos.write(response);
    	 fos.close();
    	 path = "products/"+name+".jpg";
    	 return path;
    }
    	
}
