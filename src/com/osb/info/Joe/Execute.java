package com.osb.info.Joe;

import com.osb.Main;

import java.util.Scanner;

/**
 * Main/executable class of Joe's information programme.
 *
 * @version 1.6
 */
public class Execute {

    public static void run() {

        //Programme description
        Main.println("[This programme can show you information about Joe, enter a number displayed below to continue with corresponding information.]" +
                "\n//Enter '0' to exit to the OSB main programme.");
        Main.println("//1 - Joe's personal info.");
        Main.println("//2 - Joe's girlfriend.");
        Main.println("//3 - Joe's Phone.");
        Main.println("//4 - Joe's waifu.");

        Scanner s = new Scanner(System.in);

        Main.print("//Enter your number selection here: ");

        //Receive keyboard input
        int numSelection = s.nextInt();

        //Identify 'exit' command
        if (numSelection == 0) {
            Main.main(null);
        }

        //Number identification
        switch (numSelection) {
            case 1:
                JoeInfo.personal();
                break;
            case 2:
                JoeGirlfriends.joeGF1();
                break;
            case 3:
                JoePhone.joePh1();
                break;
            case 4:
                JoeWaifu.joeWF1();
                break;
            default:
                Main.errorIvdNum();
                System.exit(0);
        }

        //Rerun / Return to Main
        Main.println("------------------------------------------------------------------------------------------------------------------------------------------------- ");
        Main.print("//Enter '1' to rerun the JoeInfo programme, or enter '0' to exit to the OSB main programme: ");

        int rerun = s.nextInt();

        //Identify rerun/exit command
        if (rerun == 1) {
            run();
        } else if (rerun == 0) {
            Main.main(null);
        } else {
            Main.errorIvdNum();
            System.exit(0);
        }
    }
}