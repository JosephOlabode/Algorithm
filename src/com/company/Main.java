package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {11, 14,  34, 56, 77, 88, 99, 123, 456, 2345};
        System.out.println("Binary Search: " + Recursion.binarySearch(array, 99, 0, array.length - 1));

    }
}

