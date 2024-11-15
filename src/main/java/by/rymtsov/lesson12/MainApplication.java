package main.java.by.rymtsov.lesson12;

import main.java.by.rymtsov.lesson12.array_operations.ArrayOperations;
import main.java.by.rymtsov.lesson12.numbers_operations.Bank;
import main.java.by.rymtsov.lesson12.numbers_operations.Euclid;
import main.java.by.rymtsov.lesson12.numbers_operations.SumOfDigits;
import main.java.by.rymtsov.lesson12.regex_operations.RegexOperations;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is the application runner class.
 */

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hex string: ");
        String hex = sc.nextLine();
        System.out.println(hex + ": " + RegexOperations.checkIfStringIsHex(hex));
        System.out.print("Enter the URL: ");
        String url = sc.nextLine();
        System.out.println(url + ": " + RegexOperations.checkIfStringIsUrl(url));
        System.out.println("-------------------------");

        System.out.print("Input the number: ");
        long number = sc.nextLong();
        System.out.println("Sum of digits of this number = " + SumOfDigits.calculateSumOfDigits(number));
        System.out.println("-------------------------");

        System.out.print("Input two numbers: ");
        int a = sc.nextInt(); int b = sc.nextInt();
        System.out.println("The great common divisor of these numbers is " + Euclid.calculateGCD(a, b));
        System.out.println("-------------------------");

        System.out.print("Input your amount and quantity of years: ");
        double amount = sc.nextDouble(); int years = sc.nextInt();
        System.out.println("Your amount after " + years + " year(s) is " + Bank.calculateInvestment(amount, years));
        System.out.println("-------------------------");

        System.out.print("Input the size of array and a rotate degree: ");
        int n = sc.nextInt(); int k = sc.nextInt();
        int[] arr = ArrayOperations.randomArray(n);
        System.out.println("Your array: " + Arrays.toString(arr));
        System.out.println("Your new array: " + Arrays.toString(ArrayOperations.rotateArrayToRight(arr, k)));
        System.out.println("-------------------------");

        System.out.print("Input the size of the array: ");
        int size = sc.nextInt();
        int[] arrayForTwoSum = ArrayOperations.randomArray(size);
        System.out.println("Your array: " + Arrays.toString(arrayForTwoSum));
        System.out.print("Input the target value: ");
        int target = sc.nextInt();
        ArrayOperations.twoSum(arrayForTwoSum, target);
        System.out.println("-------------------------");
        sc.close();
    }
}
