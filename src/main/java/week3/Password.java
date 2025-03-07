package week3;

import static input.InputUtils.stringInput;

public class Password {

    public static void main(String[] args) {

        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password");

        int maxGuesses = 5;

        //Before we let the user in, we need to check that the password is correct
        //The loop will repeat while the password is not "kitten",our secretPassword
        while ( ! userPassword.equals(secretPassword) && maxGuesses > 1 ) {
            System.out.println("Password incorrect,access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGuesses--;
        }

        if (maxGuesses > 1) {  //ran out of guesses
            System.out.println("Correct password - access granted");
            // TODO - top secret program here!
        }

        else {
            System.out.println("Max number of password attempts. ");
            System.exit(0);
        }
        // TODO - top secret program here!
    }
}
