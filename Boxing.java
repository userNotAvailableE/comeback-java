package com.boxing;

public class Boxing {
    public static void main(String[] args) {
        int i = 5; // primitives are fast
        Integer ii = new Integer(i);  // boxing wrapping

        int j = ii.intValue(); // unboxing unwrapping

        Integer value = i; // Auto boxing

        int k = value;  // Auto unboxing

        System.out.println(i + " " + ii + " " + value + " " + k);
        // runs without error

        String str = "123";
        // int n = str; // not good
        int n = Integer.parseInt(str);
        System.out.println("After parseInt " + n);

    }
}
