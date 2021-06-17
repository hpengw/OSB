package com.osb.MathUtil;

import com.osb.Main;

import java.util.Scanner;

/**
 * Output all prime numbers between '1 ~ n'.
 *
 * @version 1.2
 */
public class PrimeNumber {

    public static void run() {

        Main.println("[This tool will generate all prime numbers between '1 ~ n']");

        Scanner s = new Scanner(System.in);

        Main.print("Enter a positive integer (n): ");

        int n = s.nextInt();

        if (!(n > 0)) {
            Main.println("//Error: The number should be greater than 0!");
            Main.rerun();
        }

        int count = 0;

        for (int i = 2; i <= n; i++) {

            boolean isPrimeNum = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }

            if (isPrimeNum) {
                Main.print(i + "  ");
                count++;

                if (count == 20) {

                    Main.println();
                    count = 0;
                }
            }
        }

        Main.println();
        Main.rerun();

    }
}
