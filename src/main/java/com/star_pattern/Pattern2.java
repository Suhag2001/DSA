package com.star_pattern;

//****
//***
//**
//*
public class Pattern2 {
    public static void main(String[] args) {
        for(int i=8; i>=1; i--){
            for(int j = i;j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
