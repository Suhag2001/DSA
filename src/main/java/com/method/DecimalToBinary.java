package com.method;

public class DecimalToBinary {

    private static long decimalToBinary(long decimal){
       long binary =0;
       long power = 0 ;
       while ( decimal > 0){
           long rem  = decimal % 2 ;
           binary = binary + rem * (long) (Math.pow(10 , power));
           power++;
           decimal = decimal/2;
       }

        return binary;
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(255));
    }
}
