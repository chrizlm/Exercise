package com.chris.problemsolving.for_loop;


import java.util.Scanner;

/*
Ask user how many prime numbers they want printed
print them and sum
 */
public class Loop5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many prime numbers you want");
        System.out.print("Number: ");
        int count = scan.nextInt();
        scan.close();

        int numbers = 1000;
        int count2 = 0;
        int sum = 0;
        boolean isPrime = true;


        for (int i=1; i<numbers; i++){
            isPrime=true;
            for (int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                count2++;
                sum = sum + i;
                System.out.print( i +" ");
                isPrime=false;
            }

            if(count == count2){
                break;
            }
        }

        System.out.println();
        System.out.print("The sum of the prime numbers is: " + sum);
    }
}
