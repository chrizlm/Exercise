package com.chris.problemsolving.for_loop;

import java.util.Scanner;

/*
Take two numbers from user and print result of multiplication and sum of all numbers between these two numbers
 */
public class Loop3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("first number must be smaller than second number");
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        scan.close();

        int sum = 0;
        int mult = 1;

        if(num1 < num2){
            for (int i=num1+1; i<num2; i++){
                sum = sum + i;
                mult = mult * i;
            }
        }

        System.out.println("Sum: " + sum +
                "  Multiplication: " + mult);

    }
}
