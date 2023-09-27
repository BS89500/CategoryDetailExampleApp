package com.example.categorydetailexampleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food> {
    public FoodAdapter(Context context, ArrayList<Food> foodList) {
        super(context, 0, foodList);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        Food myFood = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_food_row_layout, parent, false);
        }
        // Step 1: Connect XML references for YOUR custom view
        TextView nameTv = convertView.findViewById(R.id.foodName);
        TextView desc = convertView.findViewById(R.id.desc);
        TextView price = convertView.findViewById(R.id.price);
        // Step 2: Populate the specific row data into the variables you made in step 1
        nameTv.setText(myFood.getFood());
        desc.setText(myFood.getSpecialInstructions());
        price.setText(Double.toString(myFood.getPrice()));
        // Step 3: Return the completed view to render on screen
        return convertView;
    }

}
