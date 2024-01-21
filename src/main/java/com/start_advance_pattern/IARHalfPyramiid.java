package com.start_advance_pattern;


// Inverted and Rotated Half Pyramid

//   *
//  **
// ***
//****

public class IARHalfPyramiid {

   public static void invertedAndRotatedHalfPyramid(int n){
     for (int i = 1; i <=  n; i++){
         //spaces
         for (int j = 1; j <=  n-i; j++){
             System.out.print(" ");
         }
         for (int j = 1; j <= i; j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
    public static void main(String[] args) {
invertedAndRotatedHalfPyramid(28);
    }
}
