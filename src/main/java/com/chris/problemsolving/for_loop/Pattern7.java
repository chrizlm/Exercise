package com.chris.problemsolving.for_loop;

/*
create such a pattern
     #
    # #
   #   #
  #     #
 #       #
# # # # # #
 */
public class Pattern7 {
    public static void main(String[] args){
        for (int i=6; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("#");
            for (int k=6; k>i; k--){
                System.out.print(" ");
            }
            for (int l=6; l>i; l--){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();

        }

        for (int m=8; m>=1; m--){
            System.out.print("# ");
        }
    }
}
