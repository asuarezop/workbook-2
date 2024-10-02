package com.pluralsight.name;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);

        //Storing user input for final display
        String userFirstName;
        String userMiddleName;
        String userLastName;
        String userSuffix;

        //To display final concatenated output
        String fullName;

        System.out.println("Welcome to name generator! Please enter your name");
        System.out.print("First name: ");
        userFirstName = nameInput.nextLine().trim();

        System.out.print("Middle name: ");
        userMiddleName = nameInput.nextLine().trim();

        System.out.print("Last name: ");
        userLastName = nameInput.nextLine().trim();

        System.out.print("Suffix: ");
        userSuffix = nameInput.nextLine().trim();

        //To add comma after last name if suffix exists
        String hasSuffix = ", " + userSuffix;

        fullName = userFirstName + " " + (userMiddleName.isEmpty()?"":" ") + userLastName + (userSuffix.isEmpty()?"": hasSuffix);
        System.out.printf("Full name: %s", fullName);
    }
}
