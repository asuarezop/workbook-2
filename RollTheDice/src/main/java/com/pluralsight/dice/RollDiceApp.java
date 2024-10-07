package com.pluralsight.dice;

public class RollDiceApp {
    public static void main(String[] args) {
        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int sum;

        Dice dice =  new Dice();

        for (int i = 0; i <= 100; i++)  {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            System.out.println("Roll 1: " + roll1 + " - " + roll2 + " Sum: " + sum) ;

            if (sum == 2) {
                twoCounter += 1;
            } else if (sum == 4) {
                fourCounter += 1;
            } else if (sum == 6) {
                sixCounter += 1;
            } else if (sum == 7) {
                sevenCounter += 1;
            }
        }

        System.out.println("\nTwo counter: " + twoCounter);
        System.out.println("Four counter: " + fourCounter);
        System.out.println("Six counter: " + sixCounter);
        System.out.println("Seven counter: " + sevenCounter);
    }
}
