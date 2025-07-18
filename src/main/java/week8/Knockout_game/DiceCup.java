package week8.Knockout_game;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {

    private List<Dice> allDice;

    public DiceCup(int numberOfDice) {
        allDice = new ArrayList<Dice>();
        for (int d = 0; d < numberOfDice; d++) {
            Dice dice = new Dice();
            allDice.add(dice);
        }
   }

   public int rollAll() {
        int total = 0;
        for (Dice dice : allDice) {
            int direRoll = dice.roll();
            total = total + direRoll;
        }

        return total;
   }
}
