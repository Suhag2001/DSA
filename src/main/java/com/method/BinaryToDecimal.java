package com.method;

public class BinaryToDecimal {

    public static long binaryToDecimal(long binary){
        long decimal = 0 ;
        long power = 0;
        while (binary>0){
            long rem =binary%10;
            decimal = (long) (decimal + ((Math.pow(2,power))*rem));
            binary/=10;
            power++;
        }
        return decimal;

    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(11111));
    }
}
