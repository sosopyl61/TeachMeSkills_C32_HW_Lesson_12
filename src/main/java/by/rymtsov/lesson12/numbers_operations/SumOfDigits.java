package main.java.by.rymtsov.lesson12.numbers_operations;

/**
 * This class contains static method
 * which calculates the sum of digits
 * in the entering number.
 */

public class SumOfDigits {
    public static long calculateSumOfDigits(long n) {
        if (n < 0) {
            System.out.println("You entered the negative number!");
            return 0;
        } else if (n < 10) return n;
        else {
            long sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
}
