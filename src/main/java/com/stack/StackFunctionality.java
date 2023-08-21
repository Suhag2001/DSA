package com.stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackFunctionality {
    public static void main(String[] args){
//        StackFunctionality s = new StackFunctionality();
//        s.push(2);
//        s.push(3);
//        s.push(6);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.peek());
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        System.out.println(stack.peek());

    }
    int[] arr = new int[6];
    int top =-1 ;
    public  boolean isFull(){
        return top > arr.length;
    }
    public  void push(int value){
        if(isFull()) {
            System.out.println("Stack is full");
        }else {
            arr[++top] =value;
        }
        System.out.println(arr[top]);
    }

    public boolean isEmpty(){
        return  top==-1;
    }

    public  int pop(){

        if(isEmpty()){
            System.out.println("stack is empty");
        }else {
            return arr[top--];
        }
        return 0 ;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }else {
            return arr[top];
        }
        return 0;
    }


}
