package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Name: ");
        String name = scan.nextLine();
        System.out.println("Your Surname: ");
        String surname = scan.nextLine();
        System.out.println("Favorite color: ");
        String color = scan.nextLine();
        System.out.println("Day of birth: ");
        int day = scan.nextInt();
        System.out.println("Month of birth: ");
        int month = scan.nextInt();
        System.out.println("Year of birth: ");
        int year = scan.nextInt();

        int birthSum = day + month + year;

        String password = name + "-" + surname + "-" + color + "-" + birthSum;

        System.out.println("Your password is: " + password);

        scan.close();
    }
}
