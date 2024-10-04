package com.pluralsight.loops;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        String launchText = "LAUNCH!";

        //Counting backwards with a for loop to count from 10 to 1
        for (int count = 10; count > 0; --count) {
            Thread.sleep(1000); //slows the execution speed for program to stop 1 second in between
            System.out.println(count);

            if (count == 1) {
                System.out.println(launchText);
            }
        }
    }
}
