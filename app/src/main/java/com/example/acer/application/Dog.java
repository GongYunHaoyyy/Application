package com.example.acer.application;

public class Dog {
    private String name;
    private int imageID;
    public Dog(String name,int imageID){
        this.name=name;
        this.imageID=imageID;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
}
