package com.Exercises1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalPrice = 0;
        double change = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter the item you want to buy");
            String itemName = input.nextLine();

            System.out.println("Enter the price of the item");
            double itemPrice = input.nextDouble();

            totalPrice += itemPrice;
            System.out.println("This is you total " + totalPrice);

        }

        System.out.println("Please pay for the items");
        double amountPaid = input.nextDouble();

        if (amountPaid > totalPrice) {
            change = amountPaid - totalPrice;
            System.out.println("Your change is " + change);
        }
        System.out.println("Thank you for shopping");

    }
}
