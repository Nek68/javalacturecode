package week3;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

     //    final int numberOfDays = 7;

         String[] dayNames = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        double total = 0;
        //of by one error - fixed
        for (int day = 0; day < dayNames.length; day++) {
            String dayName = dayNames[day];
            double amountSpent = doubleInput("What did you spend " +
                    "on bus fares on day " + dayName);
            total = total + amountSpent;
        }
        System.out.printf("Total for the week = $%.2f", total);
    }
}
