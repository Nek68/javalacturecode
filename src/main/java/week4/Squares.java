package week4;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
//        double number = doubleInput("please enter a number and I'll square it");
//        double squared = square(number);
//        System.out.println("The square of " + number + " is " + squared);

          for (int X=1; X<=10; X++) {
              double a = square(X);
              System.out.println("Square of " + X + " is " + a);
          }
    }  // This is the end of the main method.
    public static double square(double n) {
        double sq = n * n;  // The square of a number is that number multiplied by itself
        return sq;

    } // The end of the square method
} // End of the Squares class
