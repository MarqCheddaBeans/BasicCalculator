package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {

        //import scanner
        Scanner myScanner = new Scanner(System.in);

        //Ask user for name and store input in string named name
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        //ask user for hours worked and store in float named hours
        System.out.println("Enter hours worked: ");
        float hours = myScanner.nextFloat();

        //ask user for hourly rate and store in float named hourlyRate
        System.out.println("Enter hourly pay rate: ");
        float hourlyRate = myScanner.nextFloat();

        //calculate gross pay and store in float named grossPay
        float grossPay = hours * hourlyRate;

        //print out text welcoming user and displaying the gross pay based on input
        System.out.println("Welcome " + name + "!");
        System.out.println("Your gross pay is: " + grossPay);

    }
}
