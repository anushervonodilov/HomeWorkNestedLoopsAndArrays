package com.Exercises1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Do you want to apply for a credit card");
            String answer = input.next();

            if ((answer.equalsIgnoreCase("yes"))) {
                break;
            }

        }




    }
}
