package com.pluralsight;
/*
Create a Java application named BasicCalculator that reads in two floating point
numbers and then asks the user whether they want to add, subtract, multiply or
divide the two numbers
 */
import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {

        //
        Scanner myScanner = new Scanner(System.in);

        //ask user for first number + store user input in variable named firstNum
        System.out.println("Enter first number: ");
        float firstNum = myScanner.nextFloat();

        //ask user for second number + store user input in variable named secondNum
        System.out.println("Enter second number: ");
        float secondNum = myScanner.nextFloat();

        //print out menu where user would pick calculation
        System.out.println("Possible calculations:\n" + "(A)dd\n" +  "(S)ubtract\n" + "(M)ultiply\n" + "(D)ivide");
        System.out.println("Please select an option: ");

        //buffer
        myScanner.nextLine();

        //receive user input for calculation option
        String option = myScanner.nextLine();

        //calculate + display product
        float product = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + product);


    }
}
