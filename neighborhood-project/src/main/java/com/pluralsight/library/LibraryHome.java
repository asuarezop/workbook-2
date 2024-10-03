package com.pluralsight.library;

import java.util.Scanner;

public class LibraryHome {

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        Book b = new Book(1, "9788845292613","Lord of the Rings", false, "Mikayla Brown" );

    }


    public static void showAvailableBooks(){}

    public static void showCheckedOutBooks() {}

    public static void checkInBook(){}

    public static void menuSelection(String userSelection) {
        System.out.print("Make your selection");
//        return inputSc.nextLine();
    }
}
