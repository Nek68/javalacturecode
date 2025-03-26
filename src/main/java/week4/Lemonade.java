package week4;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade {
    public static void main(String[] args) {

        // Calculate operating cost and profit for a lemonade stand.
        // The lemonade stand sells lemonade,and cookies too.

        // to calculate profit, need to know how much was spent on lemonade supplies, what one cup of
        //lemonade sold for, and the number of cups sold.
        double lemonadeProfit = calculateProfitForProduct("lemonade");
        System.out.println(" Lemonade profit = $" + lemonadeProfit);

        // Do same calculation for cookies

        // To calculate profit, need to know how much was spent on cookie supplies, what one cookie
        // sold for, and the number of cookies sold.

        double cookieProfit = calculateProfitForProduct("cookies");
        System.out.println(" Cookie profit = $" + cookieProfit);

        double coffeeProfit = calculateProfitForProduct("coffees");
        System.out.println(" Coffee profit = $" + coffeeProfit);
    }
    public static double calculateProfitForProduct(String productName) {
        double suppliesCost = doubleInput("How much did you spend on " + productName + " supplies?");
        double salePrice = doubleInput("What did you sell one " + productName + " for?");
        int numberSold = intInput("How many " + productName + " did you sell?");

        // Calculate profit
        double profit = ( numberSold * salePrice) - suppliesCost;
        return profit;
    }

}
