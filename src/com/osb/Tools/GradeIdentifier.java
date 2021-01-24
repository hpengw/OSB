package com.osb.Tools;

import com.osb.Main;

import java.util.Scanner;

/**
 * A programme that identifies math marks and output the score out of 100 and final grade.
 *
 * @version 1.3
 */
public class GradeIdentifier {

    public static void run() {

        Scanner scan = new Scanner(System.in);

        Main.print("//Please enter your score out of 45: ");

        double s45 = scan.nextDouble(); //Gets keyboard input

        double s100 = s45 / 45 * 100; //Converts data

        if (s45 < 0 || s45 > 45) { //Identify data range (Legal/Illegal)
            Main.println("//Error: Please enter a number range from 0 - 45.");
            System.exit(0);
        } else if (s100 >= 90) {
            Main.println("//Your score out of 100 is " + s100 + '.');
            Main.println("//Grade: A");
        } else if (s100 >= 80) {
            Main.println("//Your score out of 100 is " + s100 + '.');
            Main.println("//Grade: B");
        } else if (s100 >= 70) {
            Main.println("//Your score out of 100 is " + s100 + '.');
            Main.println("//Grade: C");
        } else if (s100 >= 60) {
            Main.println("//Your score out of 100 is " + s100 + '.');
            Main.println("//Grade: D");
        } else {
            Main.println("//Your score out of 100 is " + s100 + '.');
            Main.println("//Grade: E");
        }
    }
}