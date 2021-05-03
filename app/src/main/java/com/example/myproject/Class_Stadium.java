package com.example.myproject;

public class Class_Stadium {
    private String profile_image , image1 , image2 , image3 ;    //     <--- convert to url
    private String st_name , manger_name , manger_phone1 ,manger_phone2 ,st_Id, duration_start,duration_End,hour_price,location;
                                                                // Lpcation  string >>. double

//  constractor for registarion    without ID
    public Class_Stadium(String profile_image, String image1, String image2, String image3, String st_name, String manger_name, String manger_phone1, String manger_phone2, String duration_start, String duration_End, String hour_price, String location) {
        this.profile_image = profile_image;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.st_name = st_name;
        this.manger_name = manger_name;
        this.manger_phone1 = manger_phone1;
        this.manger_phone2 = manger_phone2;
        this.duration_start = duration_start;
        this.duration_End = duration_End;
        this.hour_price = hour_price;
        this.location = location;
    }
// compleet constractor
    public Class_Stadium(String profile_image, String image1, String image2, String image3, String st_name, String manger_name, String manger_phone1, String manger_phone2, String st_Id, String duration_start, String duration_End, String hour_price, String location) {
        this.profile_image = profile_image;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.st_name = st_name;
        this.manger_name = manger_name;
        this.manger_phone1 = manger_phone1;
        this.manger_phone2 = manger_phone2;
        this.st_Id = st_Id;
        this.duration_start = duration_start;
        this.duration_End = duration_End;
        this.hour_price = hour_price;
        this.location = location;
    }

    public String getProfile_image() {
        return profile_image;
    }
    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
    public String getImage1() {
        return image1;
    }
    public void setImage1(String image1) {
        this.image1 = image1;
    }
    public String getImage2() {
        return image2;
    }
    public void setImage2(String image2) {
        this.image2 = image2;
    }
    public String getImage3() {
        return image3;
    }
    public void setImage3(String image3) {
        this.image3 = image3;
    }
    public String getSt_name() {
        return st_name;
    }
    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }
    public String getManger_name() {
        return manger_name;
    }
    public void setManger_name(String manger_name) {
        this.manger_name = manger_name;
    }
    public String getManger_phone1() {
        return manger_phone1;
    }
    public void setManger_phone1(String manger_phone1) {
        this.manger_phone1 = manger_phone1;
    }
    public String getManger_phone2() {
        return manger_phone2;
    }
    public void setManger_phone2(String manger_phone2) {
        this.manger_phone2 = manger_phone2;
    }
    public String getSt_Id() {
        return st_Id;
    }
    public void setSt_Id(String st_Id) {
        this.st_Id = st_Id;
    }
    public String getDuration_start() {
        return duration_start;
    }
    public void setDuration_start(String duration_start) {
        this.duration_start = duration_start;
    }
    public String getDuration_End() {
        return duration_End;
    }
    public void setDuration_End(String duration_End) {
        this.duration_End = duration_End;
    }
    public String getHour_price() {
        return hour_price;
    }
    public void setHour_price(String hour_price) {
        this.hour_price = hour_price;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}


