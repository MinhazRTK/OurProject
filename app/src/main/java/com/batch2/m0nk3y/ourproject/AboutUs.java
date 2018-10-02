package com.batch2.m0nk3y.ourproject;

public class AboutUs {
    private int id;
    private String name;
    private String idNo;
    private int image;

    public AboutUs(int id, String name, String idNo, int image) {
        this.id = id;
        this.name = name;
        this.idNo = idNo;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return name;
    }

    public String getShortdesc() {
        return idNo;
    }

    public int getImage() {
        return image;
    }
}
