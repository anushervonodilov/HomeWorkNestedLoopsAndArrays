package com.Exercises1;

public class Array5 {
    public static void main(String[] args) {

        int[] nums = new int[5];

        int sum = 0;

        nums[0] = 12;
        nums[1] = 10;
        nums[2] = 4;
        nums[3] = 2;
        nums[4] = 1;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println(sum);



    }
}
