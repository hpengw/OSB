package com.osb.info.Joe;

import com.osb.Main;
import com.osb.Classes.Phone;

public class JoePhone {

    public static void joePh1() {

        Phone joe_iPhoneX = new Phone("Apple", "iPhone X", "3 Nov 2017", "Apple A11 Biotic",
                "3 GB LPDDR4X RAM", "64 or 256 GB", "5.85 in (149 mm) Super Retina HD",
                "12MP Wide + 12MP Telephoto");

        Main.println("# Information about Joe's 1st phone: ");
        Main.println("# Brand: " + joe_iPhoneX.getBrand());
        Main.println("# Model: " + joe_iPhoneX.getModel());
        Main.println("# Release Date: " + joe_iPhoneX.getRelDate());
        Main.println("# SoC: " + joe_iPhoneX.getSoc());
        Main.println("# Memory: " + joe_iPhoneX.getMemory());
        Main.println("# Storage: " + joe_iPhoneX.getStorage());
        Main.println("# Display: " + joe_iPhoneX.getDisplay());
        Main.println("# Camera: " + joe_iPhoneX.getCamera());

    }

}
