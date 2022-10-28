package week3writinghw;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1_OddEvenTernary {
    public static void main(String[] args) {
        //Scanner declaration for reading input from cnsole
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isOddOrEvenNumber(number);
        scanner.close();


    }

    //Checking the number is odd or even
    public static void isOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
