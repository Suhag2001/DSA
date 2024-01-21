package com.start_advance_pattern;

//Inverted half pyramid with numbers
//
//12345
//1234
//123
//12
//1
public class IHalfPyramidWithNumber {
    public static void invertedHalfPyramid(int number){
        for (int i = number; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramid(10);
    }
}
