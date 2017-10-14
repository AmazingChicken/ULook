package controllers;
// Utilise play framework
import play.mvc.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
      	return ok(views.html.recommend.render());
    }
    public Result search(){
      	return ok(views.html.search.render());
    }
    public Result getInspired(){
      	return ok(views.html.getInspired.render());
    }
    public Result myOutfits(){
      	return ok(views.html.myOutfits.render());
    }
    public Result approach2(String s) {
        return ok(s);
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
    public Map<String,String> dummyImage(){
    	Map<String,String> yes = new HashMap<String,String>();
    	yes.put("roshe","images/roshe.jpg");
    	yes.put("Nike","images/2.png");
    	yes.put("Nike 2","images/3.png");
    	yes.put("Boot","images/boot.jpg");
    	return yes;
    }
    public ArrayList<String> dummyOptions(){
    	ArrayList<String> yes = new ArrayList<String>();
    	yes.add("Nike");
    	yes.add("Adidas");
    	yes.add("New balance");
    	yes.add("Puma");
    	yes.add("Sketchers");
    	yes.add("Timberland");
    	
    	return yes;
    }
    public ArrayList<String> dummyType(){
    	ArrayList<String> yes = new ArrayList<String>();
    	yes.add("Trainers");
    	yes.add("Casual");
    	yes.add("Boots");
    	yes.add("Sandals");
    	yes.add("Basketball");
    	yes.add("Sports");
    	
    	return yes;
    }
}

