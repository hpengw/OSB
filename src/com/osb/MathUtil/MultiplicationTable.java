package com.osb.MathUtil;

import com.osb.Main;

import java.util.Scanner;

/**
 * Outputs multiplication table (n * n).
 *
 * @version 1.2
 */
public class MultiplicationTable {

    public static void run() {

        Main.println("[This tool will generate a multiplication table of 'n * n'.]");

        Scanner s = new Scanner(System.in);

        Main.print("Enter a positive integer (n): ");

        int n = s.nextInt();

        if (!(n > 0)) {
            Main.println("//Error: The number should be greater than 0!");
            Main.rerun();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                Main.print(i + "*" + j + "=" + i * j + '\t');

            }

            Main.println();

        }

        Main.rerun();

    }
}
