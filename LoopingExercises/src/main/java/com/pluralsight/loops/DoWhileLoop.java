package com.pluralsight.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        String javaText = "I love Java";

        //Do-While loop will print out "I love Java" at least one time and 4 additional times
        do {
            System.out.println(javaText);
            i++;
        } while (i <= 4);
    }
}
