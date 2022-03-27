package com.bl.generics;

public class Main {
    public static Float maxFloat(Float a, Float b, Float c) {
        Float max = a;// assume a is initially largest
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("First Number= " + a);
        System.out.println("Sec Number= " + b);
        System.out.println("Thrird Number= " + c);
        System.out.println("Maximum Value is= " + max);
        return max;
    }


    public static void main(String[] args) {
        Main.maxFloat(7.3f, 10.1f, 9.0f);

    }
}
