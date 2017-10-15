package controllers;
// Utilise play framework
import play.mvc.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result goMainPage() {
        return ok(views.html.mainPage.render());
    }

    public Result signUpPage(){
      	return ok(views.html.signUpPage.render());
    }
    public Result myItems(){
      	return ok(views.html.myItems.render(dummyImage(),dummyOptions(),dummyType()));
    }
    public Result recommend(){
      	return ok(views.html.recommend.render(dummyOccasion(),dummyOutfit()));
    }
    public Result search(){
      	return ok(views.html.search.render(dummyImage(),dummyOptions(),dummyType()));
    }
    public Result getInspired(){
      	return ok(views.html.getInspired.render(dummyInspiree()));
    }
    public Result myOutfits(){
      	return ok(views.html.myOutfits.render(dummyOccasion(),dummyOutfit()));
    }

    public Result signUp(String name, String password) throws IOException{
      FileWriter fw = new FileWriter("app/controllers/1.txt");
      fw.write("name:"+name+" ");
      fw.write("password:"+password+"\r\n");
      fw.close();
      return ok("Your UserName is :"+ name);
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
                    System.out.println("welcome to Ulook");
                }
                
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        String content = result.toString();
    
        return ok(views.html.mainPage.render());
    }
    public Result approach1(String s) {
    //  java.io.File yourFile = new java.io.File("app/controllers/test.txt");
     // java.io.FileReader fr = new java.io.FileReader(yourFile);
      if(s.equals(" ")){
        return ok("Please enter a not empty string");
      }
      // if(s.equals("Nike")){
      //  return ok(views.html.recommend.render());
     // }
      File file = new File("app/controllers/test.txt");
      String regEx = s+".*";
      Pattern pattern = Pattern.compile(regEx);
    //System.out.println(pattern);
     // String content = Files.toString(new File("test.txt"));
      String content = txt2String(file);

     // return ok(content);
  //  System.out.println(content);
      Matcher matcher = pattern.matcher(content);
      boolean rs = matcher.find();
    //boolean isMatch = Pattern.matches(pattern, content);
      if(rs==true){
        return ok(content);
      }
      else{
       // return ok(content);
      }

    //if (s == 0) return badRequest("Wrong video ID");
      return ok();
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
      public Map<String,String> dummyImage(){
      	Map<String,String> yes = new HashMap<String,String>();
      	yes.put("roshe","images/roshe.jpg");

      	
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
     public Map<String,Outfit> dummyOutfit(){
     	Map<String,Outfit> yes = new HashMap<String,Outfit>();
     	Outfit outfit1 = new Outfit("images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/roshe.jpg");
     	Outfit outfit2 = new Outfit("images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/boot.jpg");
     	Outfit outfit3 = new Outfit("images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/chucks.jpg");
     	Outfit outfit4 = new Outfit("images/hat.jpg","images/shirt.jpg","images/pants.jpg","images/4.png");
     	yes.put("Outfit1", outfit1);
     	yes.put("Outfit2", outfit2);
     	yes.put("Outfit3", outfit3);
     	yes.put("Outfit4", outfit4);
     	return yes;
     } 
}

