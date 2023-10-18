package org.lessons.java;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] listParty = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Your Name: ");
        String nameFind = scan.nextLine();
        boolean found = false;

        /*
        for (int i = 0; i < listParty.length; i++) {
            if (nameFind.equals(listParty[i])) {
                found = true;
                break;
            }
        }
         */

        int i = 0;
        while(i < listParty.length) {
            if(nameFind.equals(listParty[i])) {
                found = true;
                break;
            }
            i++;
        }

        if (found) {
            System.out.println("Is in the list");
        } else {
            System.out.println("Not on the list");
        }

        scan.close();
    }
}
