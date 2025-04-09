package week7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

      int classCode = 2454;
      double averageEnrollment = 22.16;  // average number of students in a semester
      String className = "java";

       FileWriter writer = new FileWriter( ".java.txt");
       BufferedWriter bufferedWriter = new BufferedWriter(writer);

       bufferedWriter.write(" The class Name is " + className + "\n");
       bufferedWriter.write(" The class Code is " + classCode + "\n");
       bufferedWriter.write(" The average enrollment is " + averageEnrollment + " students.\n");

       bufferedWriter.close(); // you can do either!
        // writer.close(); // this works too
    }
}
