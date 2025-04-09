package week7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {

        // file will be created if it does not exist
        // file will be overwritten if it does exist!
//        FileWriter writer = new FileWriter("hello.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))) {

            bufferedWriter.write("Hello!");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello Java Students!");
            bufferedWriter.newLine();
            bufferedWriter.write("Goodbye!");
            bufferedWriter.newLine();

        } catch(IOException e){
            System.out.println("error writing file " + e);
        }

        try (FileWriter writer2 = new FileWriter("hello.txt", true);
              BufferedWriter bufferedWriter2 = new BufferedWriter(writer2)) { //append flag - true means add data to the end


            bufferedWriter2.write("Other data!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Hello programmers!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("End of file!");
            bufferedWriter2.newLine();

        } catch (IOException e) {
            System.out.println("Error appending data to file " + e);
        }

    }
}
