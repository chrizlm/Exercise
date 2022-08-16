package com.chris.problemsolving.for_loop;


import java.util.Scanner;

/*
count prime numbers in between one and number input from users and return greatest
 */
public class Loop4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        int count=0, large=0;
        boolean isPrime = true;

        for (int i=1; i<num; i++){
            isPrime=true;
            for (int j=2; j<i; j++){
                if(i % j == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
                large=i;
                System.out.print(i+ " ");
                isPrime=false;
            }
        }
        System.out.println("count: " + count + "  largest: " + large);
    }
}
