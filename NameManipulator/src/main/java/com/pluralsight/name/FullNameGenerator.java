package com.pluralsight.name;

import java.util.Scanner;

public class FullNameGenerator {
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    public FullNameGenerator(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);

        //Storing user input for final display
        String userFirstName;
        String userMiddleName;
        String userLastName;
        String userSuffix;

        System.out.println("Welcome to name generator! Please enter your name");
        System.out.print("First name: ");
        userFirstName = nameInput.nextLine().trim();

        System.out.print("Middle name: ");
        userMiddleName = nameInput.nextLine().trim();

        System.out.print("Last name: ");
        userLastName = nameInput.nextLine().trim();

        System.out.print("Suffix: ");
        userSuffix = nameInput.nextLine().trim();

        FullNameGenerator completeName = new FullNameGenerator(userFirstName, userMiddleName, userLastName, userSuffix);

        System.out.printf("Full name: %s", completeName);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ").append(middleName).append(" ");
        sb.append(lastName).append(", ").append(suffix);
        return sb.toString();
    }
}
