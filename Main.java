package com.bl.generics;

public class Main<T extends Comparable<T>> {
    T a;
    T b;
    T c;

    public Main(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @SafeVarargs
    public static <T extends Comparable<T>> T testMain(T... value) {
        T max = value[0]; // assume a is initially the largest

        for (int i = 1; i < value.length; i++) {
            if (value[i].compareTo(max) > 0) {
                max = value[i];
            }
        }
        System.out.println("Maximum Value is= " + max);
        return max; // returns the largest value
    }


    public static void main(String[] args) {
        // Calling method And passing values
        Main.<Integer>testMain(3, 4, 5, 9);

        Main.<Integer>testMain(7, 3, 2, 5);

        Main.<Float>testMain(6.6f, 8.8f, 7.7f, 9.3f);

        Main.<String>testMain("Apple", "Pear", "Banana", "orange", "chiku");

        Main.<Float>testMain(1.2f, 6.3f, 7.0f, 5.4f);

    }
}
