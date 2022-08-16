package com.chris.problemsolving.for_loop;

/*
pattern 3

@
@@
@ @
@  @
@   @
@    @
@@@@@@

 */


public class Pattern3 {
    public static void main(String[] args){
        //first @
        System.out.println("@");

        //loop
        for(int i=1; i<=6; i++){
            System.out.print("@"); //beginning of line
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("@"); //end of line
        }

        //last line of @
        for (int k=1; k<=5; k++){
            System.out.print("@ ");
        }
    }
}
