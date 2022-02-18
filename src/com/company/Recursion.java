package com.company;

public class Recursion {

    public static void printNumbersToOne(int number) {
        if(number == 0) {
            return;
        } else {
            System.out.println(number);
            printNumbersToOne(number - 1);
        }
    }

    public static int numberOfCatEyes(int cats) {
        if(cats == 0) {
            return 0;
        } else {
            return 2 + numberOfCatEyes(cats - 1);
        }
    }

    public static int power(int base, int number) {
        if(number == 1) {
            return base;
        } else {
            return base * power(base, number -1);
        }
    }

    public static int factorial(int number) {
        if(number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static int fibonacci(int number) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
        if(number == 0) {
            return 0;
        } else if(number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static int mobileSpeaker(int mobiles) {
        //print the total number of speaker of mobile phones, even number of mobiles have 2 speaker each while odd numbers have
        // one speak each
        if(mobiles == 0) {
            return 0;
        } else {
            if(mobiles % 2 == 0) {
                return 2 + mobileSpeaker(mobiles - 1);
            } else {
                return 1 + mobileSpeaker(mobiles - 1);
            }
        }
    }

    public static int printSumOfIntegerDigits(int number) {
        if(number <= 9) {
            return number;
        } else {
            return number % 10 + printSumOfIntegerDigits(number / 10);
        }
    }

    public static int countOccurrenceOf5(int number){
        if(number <= 9) {
            if(number == 5) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if(number % 10 == 5) {
                return 1 + countOccurrenceOf5(number / 10);
            } else {
                return 0 + countOccurrenceOf5( number / 10);
            }
        }
    }

    public static int binarySearch(int [] array, int key, int start, int end) {
        if(start <= end) {
            int middle = (start + end) / 2;
            if(array[middle] > key) {
                return binarySearch(array, key, start, middle -1);
            } else if(array[middle] < key) {
                return binarySearch(array, key, middle + 1, end);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
