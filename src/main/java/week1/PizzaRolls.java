package week1;

public class PizzaRolls {
    public static void main(String[] args) {
        //sharing pizza rolls between people
        double pizzaRolls = 16;
        int people = 3;

        double rollsPerperson = pizzaRolls/people;
        System.out.println("Each person gets " + rollsPerperson + "pizza rolls");
        System.out.printf("Each person gets %.1f pizza rolls", rollsPerperson);

    }
}
