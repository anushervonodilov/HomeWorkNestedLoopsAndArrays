package com.Exercises1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start number");
        int userInputStart = input.nextInt();
        System.out.println("Enter the end number");
        int userInputEnd = input.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = userInputStart; i <= userInputEnd; i++) {

            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of even numbers " + sumEven);
        System.out.println("Sum of odd numbers " + sumOdd);



    }
}
