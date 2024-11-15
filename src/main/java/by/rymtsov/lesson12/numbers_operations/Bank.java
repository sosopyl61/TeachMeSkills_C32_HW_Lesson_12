package main.java.by.rymtsov.lesson12.numbers_operations;

/**
 * This class contains method to calculate
 * your amount after 'years' (user's input)
 * with annual percentage rate 10%.
 */

public class Bank {
    private static final int ANNUAL_PERCENTAGE_RATE = 10;

    public static double calculateInvestment(double a, int years) {
        if (a < 0 || years <= 0) {
            System.out.println("Invalid input!");
            return 0;
        }
        else {
            double result = a;
            for (int i = 1; i <= years; i++) {
                a = a * ANNUAL_PERCENTAGE_RATE / 100;
                result += a;
                a = result;
            }
            return result;
        }
    }
}
