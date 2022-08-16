package com.chris.problemsolving.for_loop;

import java.util.Scanner;

/*
user input
rows
columns
 draw pattern

 */


public class Pattern5 {
    public static void main(String[] args) throws Exception {
        //input
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number of rows: ");
        int rows = scan.nextInt();
        System.out.println("Input number of columns: ");
        int columns = scan.nextInt();

        scan.close();

        if(rows <=0 || columns <= 0){
            throw new Exception("no negatives please");
        }else{
            for(int i=1; i<=rows; i++){
                for (int j=1; j<=columns; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
