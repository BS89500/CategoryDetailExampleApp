package com.example.categorydetailexampleapp;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String food;
    private double price;
    private String desc;
    private int img;
    public Food(String food, double price, String specInstr, int img)
    {
        this.food = food;
        this.price = price;
        this.desc = specInstr;
        this.img = img;
    }
    public Food(String food, double price, String specInstr)
    {
        this.food = food;
        this.price = price;
        this.desc = specInstr;
        this.img = 0;
    }

    // this code is needed for the Food class to work with Parcelable
    public static final Parcelable.Creator<Food> CREATOR = new
            Parcelable.Creator<Food>() {

                @Override
                public Food createFromParcel(Parcel parcel) {
                    return new Food(parcel);
                }

                @Override
                public Food[] newArray(int size) {
                    return new Food[0];
                }
            };


    public Food()
    {
        this.food = "";
        this.price = 0;
        desc = "";
        img = 0;
    }
    /** This is a "constructor" of sorts that is needed with the Parceable interface to
     * tell the intent how to create a Food object when it is received from the intent
     * basically it is setting each instance variable as a String or Int
     * if the instance variables were objects themselves you would need to do more complex * code.  We need to read in the String, double, and int data.
     *
     * @param parcel    the parcel that is received from the intent
     */

    public Food(Parcel parcel) {
        food = parcel.readString();
        price = parcel.readDouble();
        desc = parcel.readString();
        img = parcel.readInt();
    }

    /**
     * This is what is used when we send the Food object through an intent
     * It is also a method that is part of the Parceable interface and is needed
     * to set up the object that is being sent.  Then, when it is received, the
     * other Food constructor that accepts a Parcel reference can "unpack it"
     *
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(food);
        dest.writeDouble(price);
        dest.writeString(desc);
        dest.writeInt(img);
    }

    public static final Food[] dinnerItems = {
            new Food("Steak", 40.79, "Blue Rare",R.drawable.steak),
            new Food("House Speshial", 30.99, "Homemade Sauce", R.drawable.chicken_and_broccoli),
            new Food("Milk Noodles", 20.60, "Delishious", R.drawable.milknoodles)
    };
    public static final Food[] lunchItems = {
            new Food("The RatBurger", 18.39, "he wants to be eaten",R.drawable.maxresdefault),
            new Food("Chicken Breast", 30.99, "Beutifuly Cooked", R.drawable.chicken_breast),
            new Food("Chinese noodles", 20.60, "Oriental", R.drawable.chinese)
    };
    public static final Food[] breakfastItems = {
            new Food("Potato Salad", 15, "Gourmet",R.drawable.potato_slad),
            new Food("Waffle", 13.54, "Original Recipe", R.drawable.waffle),
            new Food("Pancakes", 18.75, "Lightly Cooked", R.drawable.pancakes)
    };

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
        return desc;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.desc = specialInstructions;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
    /**
     * This method is required for the Parceable interface.  As of now, this method * is in the default state and doesn't really do anything.
     *
     * If your Parcelable class will have child classes, you'll need to
     * take some extra care with the describeContents() method. This would
     * let you identify the specific child class that should be created by
     * the Parcelable.Creator. You can read more about how this works on
     *  Stack Overflow with this link.
     *           https://stackoverflow.com/questions/4778834/purpose-of-describecontents-of-parcelable-interface
     * @return
     */

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public String toString() {
        return food + '\n' +
                "$" + price + "\n" +
                desc;

    }
}
