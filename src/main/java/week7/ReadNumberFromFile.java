package week7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { // resource is closed

        String line = reader.readLine();

        while (line != null) {
            // ignore anything that isn't an integer.
            try {
                int number = Integer.parseInt(line);

                numbers.add(number);
            } catch (NumberFormatException e) {
                // ignore.
                System.out.println(line + " is not an interger, ignoring. ");
            }
            line = reader.readLine();
        }

        System.out.println(numbers);
    } catch (IOException e) {
            System.out.println("Enter reading file " + e);
        }
    }
}
