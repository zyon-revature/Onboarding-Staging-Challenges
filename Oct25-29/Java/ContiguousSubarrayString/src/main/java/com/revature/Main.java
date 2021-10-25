package com.revature;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"java2blog","javaworld","javabean","javatemp"};
        SubarrayString n = new SubarrayString(arr);
        System.out.printf("The longest common prefix is %s.\n",n.getFound());

    }
}
