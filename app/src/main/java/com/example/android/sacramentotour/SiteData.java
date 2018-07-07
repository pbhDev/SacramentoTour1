package com.example.android.sacramentotour;

import android.os.Parcel;
import android.os.Parcelable;

public class SiteData implements Parcelable {

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

    protected  SiteData(Parcel in){

       nameOfthePlace = in.readString();
        address = in.readString();
        phoneNumner = in.readString();
        website = in.readString();
        imageResourceID = in.readInt();

    }

    public static final Creator<SiteData> CREATOR = new Creator<SiteData>() {
        @Override
        public SiteData createFromParcel(Parcel in) {
            return new SiteData(in);
        }

        @Override
        public SiteData[] newArray(int size) {
            return new SiteData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameOfthePlace);
        dest.writeString(address);
        dest.writeString(website);
        dest.writeString(phoneNumner);
        dest.writeInt(imageResourceID);

    }

    @Override
    public int describeContents() {
        return 0;
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

    public void setWebsite(String website) {
        this.website = website;
    }


}
