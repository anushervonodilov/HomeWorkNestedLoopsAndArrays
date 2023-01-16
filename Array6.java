package com.Exercises1;

public class Array6 {
    public static void main(String[] args) {

        String[] countries = {"USA", "India", "Russia", "UK", "Japan", "South Korea"};
        String[] capitals = {"Washington D. C", "New-Delhi", "Moscow", "London", "Tokyo", "Seoul"};

        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j < capitals.length; j++) {
                System.out.println(countries[i] + " - " + capitals[j]);
                i++;
            }

        }




    }
}
