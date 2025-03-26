package week5;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("abdoul");
        arrayList.add("MCTC");

        String firstword = arrayList.get(0);

        for (String s : arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

        System.out.println(arrayList);
    }
}
