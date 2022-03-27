package com.bl.generics;

public class Main {
    public static String maxString(String a, String b, String c) {
        String max = a;// assume a is initially largest
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("First String= " + a);
        System.out.println("Second String= " + b);
        System.out.println("Third String= " + c);
        System.out.println("Maximum Value is= " + max);
        return max;
    }

    // main method
    public static void main(String[] args) {
        // Calling method with Integer argument
        Main.maxString("Apple", "Peach", "Banana");

    }
}
