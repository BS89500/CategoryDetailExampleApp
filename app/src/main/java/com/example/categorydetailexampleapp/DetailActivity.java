package com.example.categorydetailexampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView title = findViewById(R.id.title);
        TextView desc = findViewById(R.id.description);
        TextView price = findViewById(R.id.price);
        ImageView img = findViewById(R.id.image);

        Intent intent = getIntent();
        try {
            // This gets the particular Detailed object we are displaying
            // In this case, it is a Food object.
            Food myFood = intent.getParcelableExtra("Chosen Food");
            // This page will display the specific Detailed data for what your app is showing.
            // Get references to the xml views for name, price, desc, and photo
            // set values on the screen based on the object that was passed to this Detail activity
            title.setText(myFood.getFood());
            desc.setText(myFood.getSpecialInstructions());
            price.setText("$" + Double.toString(myFood.getPrice()));
            if (myFood.getImg() == 0) {
                // set a default pic or decide what to do in this case.
                img.setImageResource(R.drawable.screenshot_2023_09_29_at_11_53_55_am);
            }
            else {
            // replace the ___ with your ImageView variable
                img.setImageResource(myFood.getImg());
            }
        }
        catch (Exception e) {
            Log.i("Denna", "Food app not working!");
        }

    }
}