package main.java.by.rymtsov.lesson12.numbers_operations;

/**
 * This class contains method to calculate
 * the great common divisor of two numbers
 * using Euclidean algorithm.
 */

public class Euclid {
    public static int calculateGCD(int a, int b) {

        if (a <= 0 || b <= 0) {
            System.out.println("Invalid input!");
            return -1;
        } else {
            /*while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;*/
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}
