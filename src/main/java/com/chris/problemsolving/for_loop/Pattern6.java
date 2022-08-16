package com.chris.problemsolving.for_loop;

/*

create such a pattern
   &&
  &&&&
 &&&&&&
&&&&&&&&
hint: 3 triangles -- one empty two others
 */
public class Pattern6 {
    public static void main(String[] args){
        //rows
        for (int i=6; i>=1; i--){
            //empty
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            //1st & triangle
            for (int k=6; k>=i; k--){
                System.out.print("&");
            }
            //2nd & triangle
            for (int l=6; l>=i; l--){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
