/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        final float taxRate = 0.055f;

        Scanner input = new Scanner(System.in);
        float total;
        float addTax;
        float prices = 0.0f;
        int loopCount = 0;

        String cont = "";
        while (!"n".equals(cont))
        {
            loopCount++;
            System.out.printf("Enter the price of item %d: ", loopCount);
            float p = input.nextFloat();
            System.out.printf("Enter the quantity of item %d: ", loopCount);
            float q = input.nextFloat();
            System.out.print("Would you like to add another item? (y/n) ");

            prices += p * q;
            cont = input.next();
        }
        addTax = prices * taxRate;
        total = addTax + prices;

        System.out.printf("Subtotal: $%.2f", prices);
        System.out.printf("\nTax: $%.2f", addTax);
        System.out.printf("\nTotal: $%.2f\n", total);
    }
}
