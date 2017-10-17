package controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;


public class DBUtil {

    private final String DBURL = "jdbc:postgresql://localhost/playdb";  // CHANGE PORT TO 5432 BY DEFAULT
    private final String DBUSER = "postgres";
    private final String DBPASSWORD = " ";                           // CHANGE PASSWOR
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

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
    public static void main(String[] args) throws SQLException {
        String itemName = "ee2easda";
        String itemBrand = "asd";
        String itemType = "x213qwdqwdc";
        String itemCategory = "qweqw";
        String itemPrice = "sdcd";
        String itemPicture = "";
        //addItem(itemName, itemBrand, itemType, itemCategory, itemPrice, itemPicture);

        try {
            ArrayList<Item> itemList = getItemBy("brand","asd"
            );
            for(Item item: itemList){
                System.out.println(item.itemName);
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
                item = new Item();
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



}
