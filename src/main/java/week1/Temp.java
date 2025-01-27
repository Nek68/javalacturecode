package week1;

public class Temp {
    public static void main(String[] args) {
        // String and int variables to store the date
        String currentMonth = "January";
        int dayOfMonth = 11;

        // Double variables to store the high and low forecast temperatures
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        //calculate the difference between high and low temperatures
        double tempDifference = forecastHigh - forecastLow;

        // print all of the information
        System.out.println("on " + currentMonth + " " + dayOfMonth +
                " the different between the high and low temperature is " + tempDifference + "F");

        System.out.printf("on %s %d The difference between the high an low temperetures is % 2ff",
                currentMonth, dayOfMonth,tempDifference);

    }
}
