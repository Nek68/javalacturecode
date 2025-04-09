package week7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {

        String filename = "ReadNumberFromFile.Java";
        int maxLineLength = 100;
        // try with resources handling here
        try(BufferedReader reader = new BufferedReader(new FileReader("ReadNumberFromFile.Java"))) {

            boolean linesTooLong = false;
            int numberOfLinesTooLong = 0;
            String line = reader.readLine();
            int lineCounter = 1;
            while (line != null) {
                if (line.length() > maxLineLength) {
                    System.out.println("The line " + lineCounter + " is too long.");
                     System.out.println(line);
                     linesTooLong = true;
                     numberOfLinesTooLong++;

                }
                lineCounter ++;
                line = reader.readLine();
            }

            if (linesTooLong) {
               System.out.println("There were " + numberOfLinesTooLong + " line that were too long");
            } else {
                System.out.println("There were no line that were too long.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file" + filename + " because " + e);
        }
    }
}
