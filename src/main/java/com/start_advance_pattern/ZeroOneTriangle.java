package com.start_advance_pattern;

// zero one triangle
//1
//01
//101
//0101
//10101
/*
solution
row + col
i+j = even = 1
i+j = odd = 0*/
public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
}
