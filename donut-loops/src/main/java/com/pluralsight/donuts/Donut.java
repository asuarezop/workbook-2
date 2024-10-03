package com.pluralsight.donuts;

public class Donut {
    //Fields for object Donut
    private String description;
    private int calories;
    private double price;

    //Constructor to define values for each field in a new Donut object
    public Donut(String description, int calories, double price) {
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    //Getters - accessing property values for Donut object
    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        //Using the built-in toString method with Object.java
//      return super.toString() + "\n" + description + "\n" + price;

        //String Builder - used for building out long Strings, runs faster than concatenation with strings
        final StringBuilder sb = new StringBuilder();
                sb.append(description);
                sb.append(" has ").append(calories).append(" calories");;
                return sb.toString();
    }

}
