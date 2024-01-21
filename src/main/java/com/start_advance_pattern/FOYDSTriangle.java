package com.start_advance_pattern;

//FLOYD'S Triangle
//1
//23
//456
//78910
//1112131415
public class FOYDSTriangle {

    public static void foydsTriangle(int n ){
        int counter =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        foydsTriangle(5);
    }
}
