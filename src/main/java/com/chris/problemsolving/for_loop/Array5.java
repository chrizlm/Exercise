package com.chris.problemsolving.for_loop;


/*
Declare two arrays
print numbers that exists in both arrays (intersect)
 */
public class Array5 {
    public static void main(String[] args){
        int [] arr1 = {1,2,13,4,5,6,17,8,9,10};
        int [] arr2 = {11,12,13,2,15,16,17,9,19,20};

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j< arr2.length; j++){
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
