package com.pluralsight.loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        String javaText = "I love Java";

        //Printing "I love Java" 5 times
        while (i < 5) {
            System.out.println(javaText);
            i++; //need to update i to break out of the loop
        }
    }
}
