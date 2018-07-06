package com.example.android.sacramentotour;

public class SiteData {

    String nameOfthePlace;
    String address;
    String phoneNumner;
    String website;
    int imageResourceID;


    int type; //1- Sightseeing, 2- Businesses, 3- LocalEvents


    public SiteData(int type, String address, String phoneNumner, String website,
                    String nameOfthePlace, int imageResourceID) {
        this.address = address;
        this.phoneNumner = phoneNumner;
        this.website = website;
        this.nameOfthePlace = nameOfthePlace;
        this.imageResourceID = imageResourceID;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumner() {
        return phoneNumner;
    }

    public String getWebsite() {
        return website;
    }

    public String getNameOfthePlace() {
        return nameOfthePlace;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumner(String phoneNumner) {
        this.phoneNumner = phoneNumner;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setNameOfthePlace(String nameOfthePlace) {
        this.nameOfthePlace = nameOfthePlace;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
