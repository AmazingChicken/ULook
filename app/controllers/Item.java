package controllers;

public class Item {
    public String itemName;
    public String itemBrand;
    public String itemType;
    public String itemCategory;
    public String itemPrice;
    public String picture;


    public String getName() {
        return this.itemName;
    }

    public void setName(String itemN) {
        this.itemName = itemN;
    }

    public String getBrand() {
        return itemBrand;
    }

    public void setBrand(String itemB) {
        this.itemBrand = itemB;
    }

    public String getType() {
        return itemType;
    }

    public void setAType(String itemT) {
        this.itemType = itemT;
    }

    public String getCategory() {
        return itemCategory;
    }

    public void setCategory(String itemC) {
        this.itemCategory = itemC;
    }

    public String getPrice() {
        return itemPrice;
    }

    public void setPrice(String itemP) {
        this.itemPrice = itemP;
    }

    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }

}
