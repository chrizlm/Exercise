package com.chris.problemsolving.for_loop;

import java.util.Arrays;

/*
Two int arrays with 10 integers
copy the contents to a third array
one consecutive index from one array at a time
 */
public class Array1 {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {11,12,13,14,15,16,17,18,19,20};
        int arr3[] = new int[20];
        int index = 0;


        for (int i=0; i<arr1.length; i++){
            arr3[index++] = arr1[i];
            arr3[index++] = arr2[i];
        }

        for (int num : arr3){
            System.out.print(num + " ");
        }
    }
}
