package com.osb.info.Joe;

import com.osb.Main;
import com.osb.Classes.Girlfriend;

public class JoeGirlfriends {

    public static void joeGF1() {

        Girlfriend nancy = new Girlfriend("Nancy", 15, "South Korea", 168.0, 46.0, false);

        Main.println("# Information about Joe's 1st girlfriend: ");
        Main.println("# Name: " + nancy.getName());
        Main.println("# Age: " + nancy.getAge());
        Main.println("# Nationality: " + nancy.getNationality());
        Main.println("# Height: " + nancy.getHeight() + "cm");
        Main.println("# Weight: " + nancy.getWeight() + "kg");
        Main.println("# Does She Like Joe?: " + (nancy.isLoveHBF() ? "Yes" : "No"));

    }

    public static void joeGF2() {
    }

}
