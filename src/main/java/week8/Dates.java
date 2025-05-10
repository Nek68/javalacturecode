package week8;

import java.util.Date;

public class Dates {

    public static void main(String[] args) {

        // A Date object represents a point in time
        // For example, wednesday October 26 2022, 3:05pm, CST

        Date now = new Date();
        System.out.println(now);

        // number of miliseconds since Midnight January 1, 1970, UTC
        System.out.println(now.getTime());

        long milliseconds = now.getTime(); // long, not int
        System.out.println(milliseconds);

        Date dateFormTime = new Date(milliseconds);

        long numberOfMilliseconds = 12345678765L; // L at end
        Date date2009 = new Date(numberOfMilliseconds);
        System.out.println(date2009);

        if (date2009.before(now)) {
            System.out.println("2009 is earlier than now");

        }
    }
}
