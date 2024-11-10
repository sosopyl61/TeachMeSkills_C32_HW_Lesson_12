package main.java.by.rymtsov.lesson12;

import main.java.by.rymtsov.lesson12.regex_operations.RegexOperations;
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
        sc.close();
    }
}
