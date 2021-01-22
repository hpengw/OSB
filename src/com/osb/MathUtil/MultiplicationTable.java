package com.osb.MathUtil;

import com.osb.Main;

/**
 * Outputs multiplication table (n * n).
 *
 * @version 1.1
 * @since 1.0
 */
public class MultiplicationTable {

    public static void run() {

        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j <= i; j++) {

                Main.print(i + "*" + j + "=" + i * j + '\t');

            }

            Main.println();
        }
    }
}
