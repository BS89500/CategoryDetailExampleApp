package com.example.categorydetailexampleapp;

import android.media.Image;

public class Food {
    private String food;
    private double price;
    private String specialInstructions;
    private int img;
    public Food(String food, double price, String specInstr, int img)
    {
        this.food = food;
        this.price = price;
        this.specialInstructions = specInstr;
        this.img = img;
    }
    public Food(String food, double price, String specInstr)
    {
        this.food = food;
        this.price = price;
        this.specialInstructions = specInstr;
        this.img = 0;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Food{" +
                "food='" + food + '\'' +
                ", price=" + price +
                ", specialInstructions='" + specialInstructions + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
