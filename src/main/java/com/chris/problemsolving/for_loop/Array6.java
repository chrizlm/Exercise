package com.chris.problemsolving.for_loop;

import java.util.Arrays;
import java.util.Scanner;

/*
Declare a character array
take input from user
find number of vowels
 */
public class Array6 {
    public static void main(String [] args){
        String [] arr = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 characters: ");
        int count = 0;

        for (int i=0; i< arr.length; i++){
            arr[i] = scan.next();
            if(arr[i].equals("a") ||
                    arr[i].equals("e") ||
                    arr[i].equals("i") ||
                    arr[i].equals("o") ||
                    arr[i].equals("u")){
                count++;
            }

        }

        scan.close();
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("number of vowels: " + count);
    }
}
