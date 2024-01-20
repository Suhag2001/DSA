package com.star_pattern;

//A
//BC
//DEF
//GHIJ
public class Pattern4 {
    public static void main(String[] args) {
//    int character = 65;
        char ch ='A';
        for (int i = 1;i<=4;i++) {
            for(int j= 1; j<=i; j++) {
                System.out.print(Character.toChars(ch));
                ch++;
            }
            System.out.println();
        }
    }
}
