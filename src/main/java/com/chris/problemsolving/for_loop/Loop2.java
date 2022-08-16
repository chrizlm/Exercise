package com.chris.problemsolving.for_loop;

import java.util.Scanner;

/*
print yes for any prime number from user input
 */
public class Loop2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
        boolean isPrime = true;

        for (int i=2; i<= number/2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
