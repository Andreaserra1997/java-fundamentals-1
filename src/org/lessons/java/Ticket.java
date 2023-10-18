package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println("How much km?");
        int km = scan.nextInt();

        System.out.println("Your age?");
        int age = scan.nextInt();

        double priceForKm = 0.21;
        double price = km * priceForKm;
        int discount20 = 20;
        int discount40 = 40;

        if (age < 18) {
            price = price * discount20 / 100 ;
            System.out.println("Ticket price: " + format.format(price) + "€");
        } else if (age > 65) {
            price = price * discount40 / 100;
            System.out.println("Ticket price: " + format.format(price) + "€");
        } else {
            System.out.println("Ticket price: " + format.format(price) + "€");
        }

        scan.close();
    }
}
