package week7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String[] months = { "Jan", "Feb", "Mar" };

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("month.txt"));

        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            bufferedWriter.write(month + "\n");
//            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

