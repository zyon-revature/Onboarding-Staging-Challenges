package com.revature;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Create int array
        int [] arr = new int[] {23, 54, 6, 9, 8, 78};

        // Create continuous subarray sum finder object
        SubArraySum findSumInArray = new SubArraySum(arr, 78);
        System.out.println(findSumInArray.getOutput());


    }
}
