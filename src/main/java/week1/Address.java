package week1;

public class Address {
    public static void main(String[] args) {

        String city = "Minneapolis";
        String state = "mn";

        // Create a new String variable "Minneapolis, MN"
        String cityState = city + ", " + state.toUpperCase();
        System.out.println(cityState);

    }
}
