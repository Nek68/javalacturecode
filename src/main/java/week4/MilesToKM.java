package week4;

import static input.InputUtils.doubleInput;

public class MilesToKM {
    public static void main(String[] args) {
        double miles = doubleInput("Enter a number of miles ");
        double km = milesToKM(miles);
        System.out.println(miles + " miles is " + km + " Kilometers");

    }
    public static double milesToKM(double miles) {
        double Km = miles * 1.6;
        return Km;
    }
}
