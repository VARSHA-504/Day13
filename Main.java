package com.bl.generics;

public class Main<T extends Comparable<T>> {
    T a;
    T b;
    T c;

    public static <T extends Comparable<T>> T testMain(T... value) {
        T max = value[0]; // assume a is initially the largest
        // checking max value
        for (int i = 1; i < value.length; i++) {
            if (value[i].compareTo(max) > 0) {
                max = value[i];
            }
        }
        System.out.println("given values are : ");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        printMax(max);// internally calling printMax generic method
        return max; // returns the largest value
    }

    // generic method to print the max value
    public static <T> void printMax(T max) {
        System.out.println("\nMaximum Value is= " + max + "\n");
    }

    // main method
    public static void main(String[] args) {
        // Calling method And passing values
        Main.<Integer>testMain(3, 4, 5, 9, 20, 33);

        Main.<Float>testMain(6.6f, 8.8f, 7.7f, 9.3f);

        Main.<String>testMain("Apple", "Pear", "Banana", "orange", "chiku");

    }
}
