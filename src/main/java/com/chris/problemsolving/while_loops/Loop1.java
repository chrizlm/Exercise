package com.chris.problemsolving.while_loops;


import java.util.Scanner;

/*
Input 10 different integers within while loop and display largest as well as smallest
 */
public class Loop1 {
    public static void main(String[] args){
        int i = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("num 1: ");
        int a  = scan.nextInt();
        int largest = a;
        int smallest = a;

        while(i <= 10){
            System.out.println("num " + i + ": ");
            int b = scan.nextInt();
            if(b < smallest){
                smallest = b;
            }
            if (b > largest){
                    largest = b;
                }
            i++;
        }

        scan.close();
        System.out.println("smallest: " + smallest + "  largest: " + largest);

    }
}
