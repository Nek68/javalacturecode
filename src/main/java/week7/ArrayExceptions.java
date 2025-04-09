package week7;

import java.util.List;
import java.util.Random;

public class ArrayExceptions {
    public static void main(String[] args) {

        String[] classNames = {"Web", "Java","C#"};

        for (String name: classNames) {
            System.out.println(name);
        }

        List<Integer> classCodes = List.of(2560,2545,2505);

        for (int i = 0; i < classCodes.size(); i++) {
            System.out.println(classCodes.get(i));
        }

        Random rnd = makeRandomNumberGenerator();
        System.out.println(getRandomNumber(rnd));
    }
    private static Random makeRandomNumberGenerator() {
        return new Random();
    }
    private static int getRandomNumber(Random rnd) {  // rnd is nill
        return rnd.nextInt(10);  // rnd is null
        // call a method on a null object
    }
}
