package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;
import static week5.ToDoList.containsIgnoresCase;

public class GuestList {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter your name of guest or enter to quit");

            if (name.isEmpty()) {
                break;
            }

            if (containsIgnoresCase(guestList,name)) {
                System.out.println("You already added " + name);
            } else {
                System.out.println("Addding " + name + " to list");
                guestList.add(name);
            }
        }
        Collections.sort(guestList);

        printGuestName(guestList);

        // Remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests");
            printGuestName(guestList);

            if (guestList.isEmpty()) {
                System.out.println("There are no guests to remove");
                break;
            }
            int index = positiveIntInput("Enter the number of the guest to remove");
            index--;
            if (index < guestList.size()) {
                String removedGuest = guestList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            } else {
                System.out.println("Error - please enter a valid number of a guest");

            }
        }

        printGuestName(guestList);

        System.out.println("The number of guests in the guestlist is " + guestList.size());

        selectPrizeWinner(guestList);
    }

    public static void selectPrizeWinner(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("Warning - no guests - no-one to win the prize");
            return;
        }
        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size()); // 0, 1, 2, 3

        String prizeWinner = guests.get(randomGuestIndex);
        System.out.println("Guest number " + randomGuestIndex+1 + " "
                + prizeWinner + " wins a prize!");
    }
    public static void printGuestName(List<String> guest) {

        System.out.println("Your guest list is: \n");

        if (guest.isEmpty()) {
            System.out.println("There are no guests in the list.");
        }else {
        for (int i = 0; i < guest.size(); i++) {
            System.out.println( (i+1) + ": " + guest.get(i));
        }
        }
    }

    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }


}







