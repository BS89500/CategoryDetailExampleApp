package com.example.categorydetailexampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }
    public static final Food[] myDinner = {
        new Food("steak", 40.79, "blue rare",R.drawable.steak),
        new Food("house speshial", 30.99, "homemade", R.drawable.chicken_and_broccoli),
        new Food("milk noodles", 20.60, "delishious", R.drawable.milknoodles)
    };
}