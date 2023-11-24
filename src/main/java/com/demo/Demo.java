package com.demo;

public class Demo {
    public static int returnNonReapitingCharacter(String str){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (str.indexOf(c)==str.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(returnNonReapitingCharacter("abdabc"));
    }
}
