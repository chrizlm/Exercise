package com.chris.problemsolving.while_loops;

import java.util.Scanner;

/*
find number of digits in a number from user input
 */
public class Loop3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        scan.close();

        int result = 1;
        int quotient = number/10;

        while (quotient != 0){
            quotient = quotient/10;
            result++;
        }

        System.out.println("the number " + number + " has: " + result + " digit(s)");

    }
}
