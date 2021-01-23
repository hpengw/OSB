package com.osb.MathUtil;

import java.util.Scanner;

import com.osb.Main;

/**
 * A programme that adds up numbers from '1 ~ n'.
 *
 * @version 1.2
 */
public class AddUp {

    public static void run() {

        Scanner s = new Scanner(System.in);


        Main.println("//This programme adds up the numbers from 1 ~ n.");
        Main.print("//Enter a positive integer(n): ");

        int n = s.nextInt();

        Main.println("The result is " + addUp(n) + '.');
    }

    public static int addUp(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addUp(n - 1);
    }
}
