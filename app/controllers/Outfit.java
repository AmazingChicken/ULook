package controllers;

public class Outfit {
	private String Hat;
	private String Top;
	private String Bottom;
	private String Shoes;
	private String username;
	private String name;
	public Outfit(){

	}


	public Outfit(String username,String hat, String top, String bottom, String shoes, String name) {
		this.Hat = hat;
		this.Top = top;
		this.Bottom = bottom;
		this.Shoes = shoes;
		this.username = name;
		this.name = name;
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHat() {
		return Hat;
	}

	public void setHat(String hat) {
		Hat = hat;
	}

	public String getTop() {
		return Top;
	}

	public void setTop(String top) {
		Top = top;
	}

	public String getBottom() {
		return Bottom;
	}

	public void setBottom(String bottom) {
		Bottom = bottom;
	}

	public String getShoes() {
		return Shoes;
	}

	public void setShoes(String shoes) {
		Shoes = shoes;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String name) {
		this.username = name;
	}
	
}
