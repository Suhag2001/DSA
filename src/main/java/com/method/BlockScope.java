package com.method;


public class BlockScope {
    static {
        System.out.println("Hi suhag");
    }



    public static void main(String[] args) {
        System.out.println(new BlockScope().toString());
    }

}
