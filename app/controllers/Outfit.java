package controllers;

public class Outfit {
	private String Hat;
	private String Top;
	private String Bottom;
	private String Shoes;
	
	public Outfit(String hat, String top, String bottom, String shoes) {
		Hat = hat;
		Top = top;
		Bottom = bottom;
		Shoes = shoes;
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
	
}
