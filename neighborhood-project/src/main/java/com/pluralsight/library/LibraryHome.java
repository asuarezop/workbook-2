package com.pluralsight.library;

import java.util.Scanner;

public class LibraryHome {
    //Declaring public static method on Scanner will make it available on all methods inside LibraryHome
    public static Scanner inputSc;

    //Declaring an array of book objects
    public static Book[] books;

    //User input available for all methods
    public static String userInput;

    public static boolean exitMenu;

    public static void main(String[] args) {
        inputSc = new Scanner(System.in);

        //Allocating memory to store 20 book objects
        books = new Book[20];

        //List of all books -- Needs better way to assign values to properties instead of manually
        books[0] = new Book(1, "9788845292613","Lord of the Rings", false, "Mikayla Brown" );
        books[1] = new Book(2, "9780735211292", "The Four Winds", false, "");
        books[2] = new Book (3, "9780525559474", "The Midnight Library", true, "Sarah Carter");
        books[3] = new Book (4, "9780593318201", "Malibu Rising", false, "");
        books[4] = new Book (5,  "9781501161933", "Where the Crawdads Sing", true, "Michael Brooks");
        books[5] = new Book (6, "9780385547680", "The Lincoln Highway", false, "");
        books[6] = new Book (7, "9780062963673", "The Invisible Life of Addie LaRue", true, "Emily Greene");
        books[7] = new Book (8, "9780062834959", "The Guest List", false, "");
        books[8] = new Book(9, "9781982137274", "It Ends with Us", true, "Adam Foster");
        books[9] = new Book(10, "9780385547956", "Cloud Cuckoo Land", false, "");
        books[10] = new Book(11, "9780735211292", "The Paper Palace", true, "Lisa Wong");
        books[11] = new Book(12, "9780385547680", "Apples Never Fall", false, "");
        books[12] = new Book(13, "9780593321447", "The Giver of Stars", true, "David Mitchell");
        books[13] = new Book(14, "9781501139239", "The Seven Husbands of Evelyn Hugo", false, "");
        books[14] = new Book(15, "9780735280205", "American Dirt", true, "Rachel Lawson");
        books[15] = new Book(16, "9780593437353", "The Judge's List", false, "");
        books[16] = new Book(17, "9781501161902", "Verity", true, "Daniel Lopez");
        books[17] = new Book(18, "9780385545969", "A Slow Fire Burning", false, "");
        books[18] = new Book(19, "9781501197987", "The Night Watchman", true, "Olivia Banks");
        books[19] = new Book(20, "9780316499345", "The Vanishing Half", false, "");

        //Calling menuSelection to display Home Screen
        LibraryMenuSelection();
    }
    public static void LibraryMenuSelection() {
        exitMenu = false;
        String homeScreen = """
                    ======================================================================================
                    |                   * * * WELCOME TO THE NEIGHBORHOOD LIBRARY * * *                  |
                    |                                                                                    |
                    |                      -  What would you like to do today?                           |
                    |                                                                                    |
                    |                            1. Show Available Books                                 |
                    |                            2. Show Checked Out Books                               |
                    |                                                                                    |
                    |                                                                                    |
                    |                                                                                    |
                    |                              Hit ESC to exit menu                                  |
                    |                                                                                    |
                    ======================================================================================        
                    """;

        do {
            System.out.print(homeScreen);
            userInput = inputSc.nextLine().trim();

            switch(userInput) {
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "ESC":
                    exitMenu = true;
                    break;
                default:
                    throw new Error("Sorry, that's not a valid option. Please make your selection.");
            }
        } while (!exitMenu);


    }

    public static void showAvailableBooks(){
        //Console out to show all available books (not checked out by someone)
        exitMenu = false;
        String availableBooksScreen = """
                    ======================================================================================
                    |                   * * * AVAILABLE BOOKS (NOT CHECKED OUT) * * *                    |
                    |                                                                                    |
                    |                                                                                    |
                    |                                                                                    |
                    |                             C. Check Out A Book                                    |
                    |                             X. Go Back to Home Screen                              |
                    |                                                                                    |
                    |                                                                                    |
                    |                                                                                    |
                    |                               Hit ESC to exit menu                                 |
                    |                                                                                    |
                    ======================================================================================        
                    """;
       do {
           System.out.print(availableBooksScreen);

        //For Each loop to show only the books that have not been checked out yet w/ ID, ISBN, and Title
        for (Book book: books) {
            if (!book.isCheckedOut()) {
                System.out.println(book.getId() + book.getIsbn() + book.getBookTitle());
            }
        }

        userInput = inputSc.nextLine().trim();
        String fullName = "";

        switch (userInput) {
            case "C", "c":
                System.out.println("Please enter your first and last name to check out a book: ");
                fullName = inputSc.nextLine().trim();
                //Have to call checkOut method from Book class and have isCheckedOut property updated to value for fullName
                break;
            case "X", "x":
                LibraryMenuSelection();
                break;
            case "ESC":
                exitMenu = true;
                break;
            default:
                throw new Error("Sorry, that's not a valid option. Please make your selection.");
        }
       } while (!exitMenu);

        //Prompt user to select a book to check out:
                /*
                     Menu display for all available books


                      Switch statement to confirm book selection based on id of book
                     Actions: //C - Check Out A Book
                                    --> Prompt user for the name of book (title)
                                    --> Prompt user for their name (first, last)
                                    --> Update isCheckedOut property on book they selected
                              //X - Go back to Home Screen
                 */
        //Menu can repeat itself by asking user if they'd like to check out another book: Y/N

        //If user wants to exit, break out of switch statement loop
    }

    public static void showCheckedOutBooks() {
        //Console output to for all checked out books with their properties
        exitMenu = false;
        String checkedOutBooksScreen = """
                    ======================================================================================
                    |                            * * * CHECKED OUT BOOKS * * *                           |
                    |                                                                                    |
                    |                                                                                    |
                    |                                                                                    |
                    |                               C. Check In A Book                                   |
                    |                               X. Go Back to Home Screen                            |
                    |                                                                                    |
                    |                                                                                    |
                    |                                                                                    |
                    |                                Hit ESC to exit menu                                |
                    |                                                                                    |
                    ======================================================================================        
                    """;

        do {
            System.out.print(checkedOutBooksScreen);

            //Printing out all books that are checked out to user with ID, ISBN, Title, and Name of Person who checked out book
            for (Book book: books) {
                if (book.isCheckedOut()) {
                    System.out.println(book.getId() + book.getIsbn() + book.getBookTitle() + book.getCheckedOutTo());
                }
            }

            userInput = inputSc.nextLine().trim();

            switch (userInput) {
                case "C", "c":
                    checkInBook();
                case "X", "x":
                    LibraryMenuSelection();
                    break;
                case "ESC":
                    exitMenu = true;
                    break;
                default:
                    throw new Error("Sorry, that's not a valid option. Please make your selection.");
            }
        } while (!exitMenu);

        //Prompt user if they want to continue to check in a book or go back to main menu

        //Have menu persist with a switch statement + do-while loop until a chosen action is taken
        //C - Check in a book
        //X - Go back to Home screen
    }

    public static void checkInBook(){
        //Console output to ask user for id of book they'd like to check in

        //Update isCheckedOut to false and checkedOutTo to "" (empty string)
    }
}
