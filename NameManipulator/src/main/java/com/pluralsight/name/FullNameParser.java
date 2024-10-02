package com.pluralsight.name;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        String[] userFullName;

        System.out.print("Please enter your full name: ");
        userFullName = nameInput.nextLine().trim().split(" ", 3);

        if (userFullName.length == 2) {
            System.out.printf("First name: %s\n", userFullName[0]);
            System.out.printf("Last name: %s\n", userFullName[1]);
        } else if (userFullName.length == 3) {
            System.out.printf("First name: %s\n", userFullName[0]);
            System.out.printf("Middle name: %s\n", userFullName[1]);
            System.out.printf("Last name: %s\n", userFullName[2]);
        } else {
            throw new Error("You did not input your name as a string, please enter your name again.");
        }
    }
}
