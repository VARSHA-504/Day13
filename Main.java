package com.bl.generics;

public class Main<T extends Comparable<T>> {
    T a;
    T b;
    T c;

    // constructor
    public Main(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <T extends Comparable<T>> T testMain(T a, T b, T c) {
        T max = a; // assume a is initially the largest

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    // main method
    public static void main(String[]args) {
        // Calling method And passing values
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, Main.<Integer>testMain(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                Main.<Float>testMain(6.6f, 8.8f, 7.7f));
        System.out.printf("Max of %s, %s and %s is %s\n", "Apple", "Pear", "Banana",
                Main.<String>testMain("Apple", "Pear", "Banana"));
    }
}
