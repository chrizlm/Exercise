package com.chris.problemsolving.while_loops;

import java.util.Scanner;

/*
ask for the base and exponent(power) from the user and print results
 */
public class Loop2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Base: ");
        int base = scan.nextInt();
        System.out.println("Exponent: ");
        int exponent = scan.nextInt();
        scan.close();

        int result= 1, i=1;

        do{
            result = result * base;
            i++;
        }while (i <= exponent);

            System.out.println("result: " + result);

    }
}
