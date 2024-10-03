package com.pluralsight.donuts;

public class DonutShop {
    public static void main(String[] args) {
        //Passing arguments to set value of a new Donut
        Donut d = new Donut("Chocolate donut with sprinkles", 499, 3.99);

/*      Bypassing class modifier of private of setting values to a new Donut object
            d.description = "Chocolate donut with sprinkles";
            d.calories = 499;
            d.price = 3.99;
*/
        Donut d2 = new Donut("Vanilla glazed donut with rainbow sprinkles", 399, 2.99);
        /* Donut2 class values (old way of assigning values to new Donut manually
            d2.description = "Vanilla glazed donut with rainbow sprinkles";
            d2.calories = 399;
            d2.price = 2.99;
         */

        //Different ways to print out a donut
        System.out.println("\n" + d); //--> with toString()
        printDonut(d); //--> prettier format for toString()
        printDonutAsCSV(d); //--> donut in CSV format

//        printDonut(d2);
    }

    //Overriding default implementation of toString on String objects
    public static void printDonut(Donut d) {
        System.out.println(d.getDescription());
        System.out.printf("$%.2f\n", d.getPrice());
//        System.out.println(d); --> to see reference hash for 1st donut object
    }

    public static void printDonutAsCSV(Donut d) {
        System.out.print(d.getDescription());
        System.out.print(",");
        System.out.print(d.getCalories());
        System.out.print(",");
        System.out.println(d.getPrice());
    }
}
