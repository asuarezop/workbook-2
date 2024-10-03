package com.pluralsight.logic;

public class LogicExamples {
    public static void main(String[] args) {
        System.out.println("Hello");

        double area = 10 / 3;
        double remainder = 10.0 % 3.0;

        //Casting value of integer 10 to a double 10.0 --> forcing Java to interpret value as another data type temporarily
        area = (double) 10 / 3;

        System.out.println(area);
        System.out.println(remainder);

        /*
        Arithmetic operators:
           +  -  /  *  %

        Increment/decrement operators:
           ++  --

           *PREFIX version: increment/decrement will happen before variable is shown as output
           ++area = 4.33333335

           *POSTFIX version: increment/decrement won't happen until after variable is printed
           area++ = 3.33333334 ---> will later be 4.3333335
        */

        area = area + 1;   // simple addition to increment
        System.out.println(area);  // what value prints here?

        area ++;    // postfix increment
        System.out.println(area);     // What value prints here?

        System.out.println(++ area);  // what value prints here?

        System.out.println(++ area + area ++ + remainder ++);  // what value prints here?

        System.out.println(area);       // what value prints here?
        System.out.println(remainder);  // what value prints here?

        float x = (float) remainder;
        System.out.println(x);   // what value prints here?

        float y = 7.99f;
        System.out.println(y);  // what value prints here?

        double z = 8.33f;
        System.out.println(z);  // what value prints here?

        System.out.printf("%.2f\n", z);
        System.out.println(z);          // what value prints here?

        // Comparison operators
        // ==  !=  <  >  >=  <=  !

        // DO WHILE loop always executes 1 or more times (at least once)
        boolean done = false;
        int counter = 0;
        do {
            System.out.println("talking.... words...");
            if ( counter++ == 5 ) done = true;
        } while( ! done);
        System.out.println(counter);

        // WHILE loop executes 0 or more times
        counter =0;
        while(counter != 5){
            System.out.println("talking.... words...");
            counter ++;
        }

        // FOR loop executes 0 or more times
        for (int i=0; i<5; i++){
            System.out.println("Talking...");
        }

        // simple conditional executes if test is true
        if (counter > 0) {
            System.out.println("We talked about it");
        }
    }
}
