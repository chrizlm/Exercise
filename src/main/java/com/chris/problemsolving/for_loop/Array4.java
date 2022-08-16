package com.chris.problemsolving.for_loop;


import java.util.Arrays;
import java.util.Scanner;

/*
Declare array
take input from user to fill in
take two int from user
find indexes
exchange the numbers
 */
public class Array4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 digits:");
        int arr[] = new int[10];

        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.stream(arr).forEach(System.out::println);


        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scan.nextInt();
        scan.close();
        int num1index = 0;
        int num2index = 0;

        for (int i=0; i< arr.length; i++){
            if(num1 == arr[i]){
                num1index = i;
            }
            if(num2 == arr[i]){
                num2index = i;
            }
        }

        int index = arr[num1index];
        arr[num1index] = arr[num2index];
        arr[num2index] = index;

        Arrays.stream(arr).forEach(System.out::println);
    }
}
