package com.chris.problemsolving.for_loop;

/*
Take two arrays
exchange elements of both arrays
 */
public class Array7 {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {11,12,13,14,15,16,17,18,19,20};
        int arr3[] = new int[10];

        for (int i=0; i< arr1.length; i++){
            arr3[i] = arr1[i];
        }for (int i=0; i< arr2.length; i++){
            arr1[i] = arr2[i];
        }for (int i=0; i< arr1.length; i++){
            arr2[i] = arr3[i];
        }
        for (int i=0; i< 10; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i=0; i< 10; i++){
            System.out.print(arr2[i] + " ");
        }

        }
}
