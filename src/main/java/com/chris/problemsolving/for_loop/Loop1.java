package com.chris.problemsolving.for_loop;

/*
multiply all odd(1-20)
sum all even (1-100)
 */
public class Loop1 {
    public static void main(String[] args){
        int odd = 1, even = 0;

        for(int i=1; i<=20; i+=2){
            odd = odd * i;
        }
        for(int i=2; i<=100; i+=2){
            even = even + i;
        }

        System.out.println("odd: " + odd + "  even: " + even);
    }
}
