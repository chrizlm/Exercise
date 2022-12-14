package com.chris.problemsolving.for_loop;

/*
pattern 2

12345&
1234&&
123&&&
12&&&&
1&&&&&
&&&&&&


 */

public class Pattern2 {
    public static void main(String[] args){
        for(int i=1; i<7; i++){
            for(int j=6, l=1; j>i; j--, l++){
                System.out.print(l);
            }
            for (int k=1; k<=i; k++){
                System.out.print("&");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=6; i>=1; i--){
            for (int j=1; j<i; j++){
                System.out.print(j);
            }
            for (int k=6; k>i; k--){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
