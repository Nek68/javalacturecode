package week5;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        boolean wasRemoted = classNames.remove("Programming Logic");  // object
        System.out.println(classNames + " " + wasRemoted);

        classNames.remove(0); // int primitive type - index are primitive int type
        System.out.println(classNames);

        classNames.set(1, "Systems Analysis");
        System.out.println(classNames);

        String search = "Systems Analysis";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does not contain " + search);
        }

        System.out.println(classNames.size());

        classNames.clear();

        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());
    }
}
