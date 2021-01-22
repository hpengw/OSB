package com.osb.MathUtil;

import com.osb.Main;

/**
 * Math basics(constants, functions...).
 */

public class Basics {

    public Basics() {
    }

    //Constants
    public static final double PI = 3.1415926;

    public static int sum(int a, int b) {
        return a + b;
    }

    //Functions
    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static double product(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int rem(int a, int b) {
        return a % b;
    }

    public static double rem(double a, double b) {
        return a % b;
    }

    public static int addUp(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addUp(n - 1);
    }

    public static double pyThHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void arrayTest() {
        int[] a1 = {1, 3, 5, 7, 9};
        Main.println(a1.length);
        Main.println(a1[0]);
        a1[a1.length - 1] = 10;
        Main.println(a1[a1.length - 1]);
    }
}
