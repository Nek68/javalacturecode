package week7;

public class StringToInt {
    public static void main(String[] args) {

        //try running this in the debugger
        String hopeThisIsANumber = "50";
        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {
          System.out.println(hopeThisIsANumber + " is not a valid number");
        }

        System.out.println("This is the end of the program");
    }
}
