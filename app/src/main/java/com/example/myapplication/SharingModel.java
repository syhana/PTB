package com.example.myapplication;

public class SharingModel {
    private String name;
    private String image;

    public SharingModel(String name, int image) {
        this.name = name;
        this.image = String.valueOf(image);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getImage() {
        return Integer.parseInt(image);
    }

    public void setImage(String image) {
        this.image = image;
    }
}
