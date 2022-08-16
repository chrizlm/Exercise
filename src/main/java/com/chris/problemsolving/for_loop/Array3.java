package com.chris.problemsolving.for_loop;

import java.util.Scanner;

/*
int array
take input from user
print index number of that int

 */
public class Array3 {
    public static void main(String[] args){
        int arr[] = {2,3,2,38,40,28,38};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scan.nextInt();
        scan.close();

        for (int i=0; i< arr.length; i++){
            if(num == arr[i]){
                System.out.println(i + " ");
            }
        }
    }
}
