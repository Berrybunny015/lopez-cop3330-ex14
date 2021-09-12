/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declarations
        double wisconsinTax = 0.055;
        String wisconsin = "WI";

        System.out.println("\nWhat is the order amount? "); //ask the user for the order amount
        Scanner orderAmountInput = new Scanner(System.in); //scan for the order amount
        double orderAmount = orderAmountInput.nextDouble();

        System.out.println("\nWhat is the state (e.g. FL, WI, PA)? "); //ask the user for which state
        Scanner stateInput = new Scanner(System.in); //scan for the state
        String state = stateInput.next();

        double taxAmount = 0; //the amount of taxes that will be added to the total cost in the end

        if(state.equals(wisconsin)) { //if the user is a resident of Wisconsin
            taxAmount = orderAmount * wisconsinTax; //if so, then a new taxAmount is calculated
            double totalCost = orderAmount + taxAmount; //calculate the total cost

            //output the subtotal, tax, and total cost
            System.out.println("\nThe subtotal is $" + String.format("%.2f", orderAmount) + ".\nThe tax is $" + String.format("%.2f", taxAmount) + ".\n" + "The total is $" + String.format("%.2f", totalCost) + ".");

        }
        else { //if the user isn't a resident of Wisconsin
            double totalCost = orderAmount + taxAmount; //calculate the total cost

            //output the total cost
            System.out.println("\nThe total is $" + String.format("%.2f", totalCost) + ".");


        }
    }
}