package com.chris.problemsolving.for_loop;

/*
int array of 10 random values
print 2nd smallest and 2nd largest value
 */
public class Array2 {
    public static void main(String[] args){
        int arr[] = {20,25,4,7,39,40,77,2,8};
        int small = arr[0], large = arr[0];
        int small_2nd = -1, large_2nd = -1;

        for (int i=0; i<arr.length; i++){
            if(arr[i] < small){
                small_2nd = small;
                small = arr[i];
            }
            if(arr[i] > large){
                large_2nd = large;
                large = arr[i];
            }
        }

        System.out.println("2nd smallest: " + small_2nd + "  2nd large: " + large_2nd);
    }
}
