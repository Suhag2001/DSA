package com.star_pattern;

//*
//**
//***
//****
public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++) {  //lines
            for(int j = 1; j<=i; j++) {//stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
