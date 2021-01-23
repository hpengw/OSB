package com.osb.MathUtil;

import com.osb.Main;

/**
 * Output all prime numbers between '1 ~ n'.
 *
 * @version 1.1
 */
public class PrimeNumber {

    public static void run() {

        int count = 0;

        for (int i = 2; i <= 1000; i++) {

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

    }
}
