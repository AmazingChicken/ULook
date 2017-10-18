package controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class Webhose {
	private String query;
	private JsonArray data;
	
	Webhose(String query){
		this.query = query;
	}
	
	public void pullData()throws URISyntaxException, IOException{
		

        WebhoseIOClient webhoseClient = WebhoseIOClient.getInstance("9514e7ab-fd10-47c3-b523-f504a8f66e9d");
        Map queries = new HashMap();
        queries.put("q", query);
        queries.put("size", "4	0");
        JsonElement result = webhoseClient.query("productFilter", queries);
        System.out.println(result.getAsJsonObject().get("totalResults"));


        JsonArray postArray = result.getAsJsonObject().getAsJsonArray("products");
        data = postArray;

	}
	public JsonArray getData(){
		return data;
	}
}