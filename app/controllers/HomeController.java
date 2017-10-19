package controllers;
// Utilise play framework
import play.mvc.*;
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


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public String username;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() throws SQLException, IOException, URISyntaxException {
        DBUtil dbutil = new DBUtil();
        dbutil.addDb();
        return ok(views.html.index.render());
    }

    public Result goMainPage() throws IOException {

        return ok(views.html.mainPage.render());
    }

    public Result signInPage(){
        return ok(views.html.signInPage.render("a",new play.twirl.api.Html("It <em>finally</em> works!")));
    }

    public Result signUpPage(){
        return ok(views.html.signUpPage.render());
    }
    public Result details(String itemname)throws Exception{
    	ArrayList<Item> itemList = DBUtil.getItemBy("name", itemname);
        Item myItem = itemList.get(0);
        return ok(views.html.detailPage.render(myItem));
    }
    public Result myItems() throws SQLException, URISyntaxException, IOException, Exception{
        //DBUtil dbutil;
        //dbutil = new DBUtil();
        return ok(views.html.myItems.render(DBUtil.getFavouriteBy(username),dummyOptions(),dummyType()));
    }

    public Result recommend()throws SQLException, URISyntaxException, IOException, Exception{
         //DBUtil.getFavouriteBy(username);

        ArrayList<Item> arrList = new ArrayList<Item>();
        ArrayList<Item> arrList2 = new ArrayList<Item>();
        for(int i = 0;i<12;i++){
            int number = new Random().nextInt(99);
            arrList.add(DBUtil.getAllItem().get(number));

        }
        //arrList.add(DBUtil.getAllFavourite().get(number));
       // arrList = DBUtil.getFavouriteBy("un");
       // arrList2 = DBUtil.getFavouriteBy("s");
       // arrList.addAll(arrList2);
        return ok(views.html.recommend.render(arrList,dummyOptions(),dummyType()));
    }


    public Result search(String s)throws SQLException, URISyntaxException, IOException, Exception{




        DBUtil ok1 = new DBUtil();
        if (s.equals("Tops")){
        	return ok(views.html.search.render(ok1.getItemBy("category", "Top"),dummyOptions(),dummyType()));
        } else if (s.equals("Hats")){
        	return ok(views.html.search.render(ok1.getItemBy("category", "Hat"),dummyOptions(),dummyType()));
        } else if (s.equals("Bottoms")){
        	return ok(views.html.search.render(ok1.getItemBy("category", "Pants"),dummyOptions(),dummyType()));
        } else {
        	return ok(views.html.search.render(ok1.getItemBy("category", "Shoes"),dummyOptions(),dummyType()));
        }
    }
    public Result getInspired()throws Exception, IOException{
    	DBUtil.addTwitter();
        return  ok(views.html.getInspired.render(DBUtil.getInspirationList()));
    }
    public Result myOutfits() throws Exception {
        DBUtil dbutil = new DBUtil();
        ArrayList<Outfit> outfitArrayList = dbutil.getOutfitBy(username);
        ArrayList<Item> items = new ArrayList<Item>();
        
        if(!outfitArrayList.isEmpty()){
        	for (Outfit out : outfitArrayList){
	        	if (out.getHat() != null){
	        		Item hat = dbutil.getItemBy("name", out.getHat()).get(0);
	        		items.add(hat);
	        	}
	        	if (out.getTop() != null){
	        		Item top = dbutil.getItemBy("name", out.getTop()).get(0);
	        		items.add(top);
	        	}
	        	if (out.getBottom() != null){
	        		Item bottom = dbutil.getItemBy("name", out.getBottom()).get(0);
	        		items.add(bottom);
	        	}
	        	if (out.getShoes() != null){
	        		Item shoe = dbutil.getItemBy("name", out.getShoes()).get(0);
	        		items.add(shoe);
	        	}
	       
        	}
        
        	
        }
        Set<Item> temp = new HashSet<Item>();
    	temp.addAll(items);
    	items.clear();
    	items.addAll(temp);
        return ok(views.html.myOutfits.render(items));
    }
    public Result detailPage(String itemName)throws Exception{
        Item item = new Item("shoe","images/roshe.jpg");
        return ok(views.html.detailPage.render(item));
    }

    public Result signUp(String name, String password) throws IOException{
        FileWriter fw = new FileWriter("app/controllers/1.txt");
        fw.write("name:"+name+" ");
        fw.write("password:"+password+"\r\n");
        fw.close();
        return ok(views.html.signInPage.render("a",new play.twirl.api.Html("It <em>finally</em> works!")));
    }

    public Result addToOutfit(String itemName)throws Exception	{
        DBUtil dbutil = new DBUtil();
        ArrayList<Outfit> outfitArrayList = dbutil.getOutfitBy(username);
        Outfit myoutfit;
        String whatAdd;
        if(outfitArrayList.size()==0){
            myoutfit = new Outfit();

        }else {
            myoutfit = outfitArrayList.get(0);
        }
        ArrayList<Item> itemList = dbutil.getItemBy("name",itemName);
        Item myItem = itemList.get(0);
        if(myItem.getCategory().equals("Shirt")){
            myoutfit.setTop(myItem.itemName);
            whatAdd = "Shirt";
        }else if(myItem.getCategory().equals("Hat")){
            myoutfit.setHat(myItem.itemName);
            whatAdd = "Hat";
        }else if(myItem.getCategory().equals("Pants")){
            myoutfit.setBottom(myItem.itemName);
            whatAdd = "Pants";
        }else{
            myoutfit.setShoes(myItem.itemName);
            whatAdd = "Shoes";
        }
        dbutil.addOutfit(username, myoutfit.getHat(), myoutfit.getTop(), myoutfit.getBottom(), myoutfit.getShoes());
        return ok(views.html.search.render(dbutil.getItemBy("category", whatAdd),dummyOptions(),dummyType()));
    }
    public Result addToOutfit2(String itemName)throws Exception	{
        DBUtil dbutil = new DBUtil();
        ArrayList<Outfit> outfitArrayList = dbutil.getOutfitBy(username);
        Outfit myoutfit;
        String whatAdd;
        if(outfitArrayList.size()==0){
            myoutfit = new Outfit();

        }else {
            myoutfit = outfitArrayList.get(0);
        }
        ArrayList<Item> itemList = dbutil.getItemBy("name",itemName);
        Item myItem = itemList.get(0);
        if(myItem.getCategory().equals("Shirt")){
            myoutfit.setTop(myItem.itemName);
            whatAdd = "Shirt";
        }else if(myItem.getCategory().equals("Hat")){
            myoutfit.setHat(myItem.itemName);
            whatAdd = "Hat";
        }else if(myItem.getCategory().equals("Pants")){
            myoutfit.setBottom(myItem.itemName);
            whatAdd = "Pants";
        }else{
            myoutfit.setShoes(myItem.itemName);
            whatAdd = "Shoes";
        }
        dbutil.addOutfit(username, myoutfit.getHat(), myoutfit.getTop(), myoutfit.getBottom(), myoutfit.getShoes());
        return ok(views.html.myItems.render(DBUtil.getFavouriteBy(username),dummyOptions(),dummyType()));
    }
 public Result deleteFromOutfit()throws Exception  {
        DBUtil dbutil = new DBUtil();

        dbutil.deleteOutfit(username);
        
        ArrayList<Outfit> outfitArrayList1 = dbutil.getOutfitBy(username);
        ArrayList<Item> items = new ArrayList<Item>();
        
        if(!outfitArrayList1.isEmpty()){
        	for (Outfit out : outfitArrayList1){
	        	if (out.getHat() != null){
	        		Item hat = dbutil.getItemBy("name", out.getHat()).get(0);
	        		items.add(hat);
	        	}
	        	if (out.getTop() != null){
	        		Item top = dbutil.getItemBy("name", out.getTop()).get(0);
	        		items.add(top);
	        	}
	        	if (out.getBottom() != null){
	        		Item bottom = dbutil.getItemBy("name", out.getBottom()).get(0);
	        		items.add(bottom);
	        	}
	        	if (out.getShoes() != null){
	        		Item shoe = dbutil.getItemBy("name", out.getShoes()).get(0);
	        		items.add(shoe);
	        	}
        	}
        	
        }
        Set<Item> temp = new HashSet<Item>();
    	temp.addAll(items);
    	items.clear();
    	items.addAll(temp);
        return ok(views.html.myOutfits.render(items));
    }
    public Result addToFavourite(String itemName)throws SQLException, URISyntaxException, IOException, Exception{
        DBUtil dbutil = new DBUtil();

        ArrayList<Item> itemList = dbutil.getItemBy("name",itemName);
        Item myItem = itemList.get(0);
        String whereIn = myItem.getCategory();
        dbutil.addFavourite(username, itemName, itemName, itemName, itemName,itemName, myItem.getPicture());
        return ok(views.html.search.render(dbutil.getItemBy("category", whereIn),dummyOptions(),dummyType()));
    }
    
    public Result removeFromFavourite(String itemName)throws SQLException, URISyntaxException, IOException, Exception{
        DBUtil dbutil = new DBUtil();

        ArrayList<Item> itemList = dbutil.getItemBy("name",itemName);
        Item myItem = itemList.get(0);
        dbutil.deleteFavourite(itemName);

        return ok(views.html.myItems.render(DBUtil.getFavouriteBy(username),dummyOptions(),dummyType()));
    }

    public Result signIn(String name, String password) throws IOException{
        File file = new File("app/controllers/1.txt");
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){
                boolean contains1 = s.contains(name);
                boolean contains2 = s.contains(password);
                result.append(System.lineSeparator()+s);
                if(contains1==true && contains2==true){
                    username = name;
                    return ok(views.html.mainPage.render());
                }

            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        String content = result.toString();

        return ok(views.html.index.render());
    }
    public Result approach1(String s)throws Exception {
        //  java.io.File yourFile = new java.io.File("app/controllers/test.txt");
        // java.io.FileReader fr = new java.io.FileReader(yourFile);
        if(s.equals(" ")){
            return ok("Please enter a not empty string");
        }
        s = s.toLowerCase();
        // if(s.equals("Nike")){
        //  return ok(views.html.recommend.render());
        // }
        File file = new File("app/controllers/test.txt");
        String regEx = s+".*";
        Pattern pattern = Pattern.compile(regEx);
        //System.out.println(pattern);
        // String content = Files.toString(new File("test.txt"));
        ArrayList<Item> items = DBUtil.getAllItem();
        Iterator<Item> it = items.iterator();
        while (it.hasNext()){
		//    String content = txt2String(file);

        	Item check = it.next();
		    String content = check.getName().toLowerCase();
		    // return ok(content);
		    //  System.out.println(content);
		    Matcher matcher = pattern.matcher(content);
		    boolean rs = matcher.find();
		    //boolean isMatch = Pattern.matches(pattern, content);
		    if(rs==true){
		      //  return ok(content);
		    }
		    else{
		        // return ok(content);
		    	it.remove();
		    }

        }
        
        return ok(views.html.search.render(items,dummyOptions(),dummyType()));
    }

    public Result approach2(String s)throws Exception {
        //  java.io.File yourFile = new java.io.File("app/controllers/test.txt");
        // java.io.FileReader fr = new java.io.FileReader(yourFile);
        if(s.equals(" ")){
            return ok("Please enter a not empty string");
        }
        s = s.toLowerCase();
        // if(s.equals("Nike")){
        //  return ok(views.html.recommend.render());
        // }
        File file = new File("app/controllers/test.txt");
        String regEx = s+".*";
        Pattern pattern = Pattern.compile(regEx);
        //System.out.println(pattern);
        // String content = Files.toString(new File("test.txt"));
        ArrayList<Item> items = DBUtil.getFavouriteBy(username);
        Iterator<Item> it = items.iterator();
        while (it.hasNext()){
		//    String content = txt2String(file);

        	Item check = it.next();
		    String content = check.getName().toLowerCase();
		    // return ok(content);
		    //  System.out.println(content);
		    Matcher matcher = pattern.matcher(content);
		    boolean rs = matcher.find();
		    //boolean isMatch = Pattern.matches(pattern, content);
		    if(rs==true){
		      //  return ok(content);
		    }
		    else{
		        // return ok(content);
		    	it.remove();
		    }

        }
        return ok(views.html.myItems.render(items,dummyOptions(),dummyType()));
    }

    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    //Below are some functions that make dummy data for to generate stuff in the html

    public ArrayList<Item> dummyItems(){
        ArrayList<Item> yes = new ArrayList<Item>();
        Item ok = new Item("images/roshe.jpg","Roshe");
        Item ok2 = new Item("images/boot.jpg","Boot");
        Item ok3 = new Item("images/chucks.jpg","Chucks");
        Item ok4 = new Item("images/2.png","Shoe");
        Item ok5 = new Item("images/4.png","Black Nike Shoe");
        yes.add(ok);
        yes.add(ok2);
        yes.add(ok3);
        yes.add(ok4);
        yes.add(ok5);
        return yes;
    }

    public ArrayList<String> dummyOccasion(){
        ArrayList<String> yes = new ArrayList<String>();
        yes.add("Formal");
        yes.add("Casual");
        yes.add("Sport");
        yes.add("Work");
        yes.add("Semi-Formal");
        yes.add("Beach");

        return yes;
    }
    public ArrayList<String> dummyOptions(){
        ArrayList<String> yes = new ArrayList<String>();
        yes.add("Formal");
        yes.add("Casual");
        yes.add("Sport");
        yes.add("Work");
        yes.add("Semi-Formal");
        yes.add("Beach");

        return yes;
    }
    public ArrayList<String> dummyType(){
        ArrayList<String> yes = new ArrayList<String>();
        yes.add("Formal");
        yes.add("Casual");
        yes.add("Sport");
        yes.add("Work");
        yes.add("Semi-Formal");
        yes.add("Beach");

        return yes;
    }
    public Map<String,String> dummyInspiree(){
        Map<String,String> yes = new HashMap<String,String>();
        yes.put("Xenia","images/Xenia.png");
        yes.put("andreialbu_","images/andreialbu_.png");
        yes.put("blogjuniorestevam","images/blogjuniorestevam.png");
        return yes;
    }
    public ArrayList<Outfit> dummyOutfit(){
        ArrayList<Outfit> yes = new ArrayList<Outfit>();
        Outfit outfit1 = new Outfit("user1","images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/roshe.jpg","out1");
        Outfit outfit2 = new Outfit("user1","images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/boot.jpg","out2");
        Outfit outfit3 = new Outfit("user1","images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/chucks.jpg","swag");
        Outfit outfit4 = new Outfit("user1","images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/4.png","test");
        yes.add(outfit1);
        yes.add(outfit2);
        yes.add(outfit3);
        yes.add(outfit4);
        return yes;
    }
}
