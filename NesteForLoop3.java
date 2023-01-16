package com.Exercises1;

public class NesteForLoop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3 ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }

    }
}
