package week3;

import static input.InputUtils.positiveIntInput;

public class Starts {
    public static void main(String[] args) {

        // Display a square of *
        int size = positiveIntInput("Enter size of square?");

        // The outer loop print one row per loop repeat
        for (int x = 0; x < size ; x++) {

            //Inner for loop. For each row, print a star 5 time
            for (int y = 0; y < size ; y++) {
                //Notice System.out.print - not println. This doesn't add the newline
                //at the end of the output, so all the stars are on the same line
                System.out.print("*");
            }

            //And then move to the next line
            System.out.println();
       }
    }



}
