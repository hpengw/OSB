package com.osb;

import com.osb.MathUtil.AddUp;
import com.osb.MathUtil.MultiplicationTable;
import com.osb.MathUtil.PrimeNumber;
import com.osb.Tools.GradeIdentifier;
import com.osb.info.Joe.Execute;

import java.util.Date;
import java.util.Scanner;

/**
 * The main execute class for the OSB programme.
 *
 * Copyright © OSB & VJ 2021
 *
 * Pre-Release
 * @version 0.3
 *
 * 2021/06/17
 * TODO Revise | Code | for JoeInfo
 *
 */

public class Main {

    public static void main(String[] args) {

        Date d = new Date();

        println("---------------- # " + d + " # ----------------");

        println("[The OSB programme includes JoeInfo, multiple MathUtils and Tools.]" +
                "\n//Version: 0.3" +
                "\n//Enter '0' to exit.");

        println("//1 - JoeInfo");
        println("//2 - MathUtils - AddUp");
        println("//3 - MathUtils - Multiplication Table Generator");
        println("//4 - MathUtils - Prime Numbers");
        println("//5 - Tools - Grade Identifier (for summative 'Math' exams)");

        Scanner s = new Scanner(System.in);

        print("//Enter a number selection displayed above to continue: ");

        int numSelection = s.nextInt();

        if (numSelection == 0) {
            exit();
        }

        switch(numSelection) {
            case 1:
                Execute.run();
                break;
            case 2:
                AddUp.run();
                break;
            case 3:
                MultiplicationTable.run();
                break;
            case 4:
                PrimeNumber.run();
                break;
            case 5:
                GradeIdentifier.run();
                break;
            default:
                errorIvdNum();
        }

    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void println(int i) {
        System.out.println(i);
    }

    public static void println(byte b) {
        System.out.println(b);
    }

    public static void println(short s) {
        System.out.println(s);
    }

    public static void println(long l) {
        System.out.println(l);
    }

    public static void println(float f) {
        System.out.println(f);
    }

    public static void println(double d) {
        System.out.println(d);
    }

    public static void println(boolean b) {
        System.out.println(b);
    }

    public static void println(char c) {
        System.out.println(c);
    }

    public static void println(Date d) {
        System.out.println(d);
    }

    public static void println() {
        System.out.println();
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void print(int i) {
        System.out.print(i);
    }

    public static void print(byte b) {
        System.out.print(b);
    }

    public static void print(long l) {
        System.out.print(l);
    }

    public static void print(float f) {
        System.out.print(f);
    }

    public static void print(double d) {
        System.out.print(d);
    }

    public static void print(boolean b) {
        System.out.print(b);
    }

    public static void print(char c) {
        System.out.print(c);
    }

    public static void print(Date d) {
        System.out.print(d);
    }

    public static void exit() {
        println("Bye!");
        System.exit(0);
    }

    public static void rerun() {

        Scanner s = new Scanner(System.in);

        println("-------------------------------------------------------------------");
        print("//Enter '1' to rerun the OSB programme, or enter '0' to exit: ");

        int rerun = s.nextInt();

        //Identify rerun/exit command
        if (rerun == 1) {
            main(null);
        } else if (rerun == 0) {
            exit();
        } else {
            errorIvdNum();
        }
    }

    public static void errorIvdNum() {
        println("//Error: invalid number!");
        rerun();
    }
}
