package week4;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {

        int miles = 6;
        miles = changeToKM(miles);
        System.out.println(miles);  // it's still 6

        String units = "miles";
        units = changeToMetricUnits(units);
        System.out.println(units);  // it's still "miles"

        double[] speeds = {4, 5, 10, 12};  // this is in miles per hour
        convertToKilometers(speeds);
        System.out.println(Arrays.toString(speeds));

    }

    // changing a primitive type parameter has no effect on the data in the caller
    private static int changeToKM(int distance) {
        distance = 10;
        return distance;
    }

    // changing a String parameter has no effect on the data in the caller
    private static String changeToMetricUnits(String units) {
        units = "kilometers";
        return units;
    }

    private static void convertToKilometers(double[] speeds) {
        for (int s = 0; s < speeds.length; s++) {
            double speed = speeds[s];
            double speedKm = speed * 1.6;
            speeds[s] = speedKm;
        }
    }
}
