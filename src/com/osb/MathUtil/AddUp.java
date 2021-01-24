package com.osb.MathUtil;

import com.osb.Main;

import java.util.Scanner;

/**
 * A programme that adds up numbers from '1 ~ n'.
 *
 * @version 1.3
 */
public class AddUp {

    public static void run() {

        Scanner s = new Scanner(System.in);

        Main.println("[This programme adds up the numbers from 1 ~ n.]");
        Main.print("//Enter a positive integer (n): ");

        int n = s.nextInt();

        if (!(n > 0)) {
            Main.println("//Error: The number should be greater 0!");
            Main.rerun();
        }

        Main.println("The result is " + addUp(n) + '.');

        Main.rerun();
    }

    public static int addUp(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addUp(n - 1);
    }
}
