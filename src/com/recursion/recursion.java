package com.recursion;



import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class recursion {


    public static void main(String[] args) {
        recursion r = new recursion();
//        r.even(10);
//        r.odd(10);
//        System.out.println( r.fun(234));
//       System.out.println( r.addition(253));
//        System.out.println( r.fibbo(5));
//       System.out.println(r.sum(5));
        int a[] = {5, 3, 4, 5, 1, 556, 78};
        int min = a[0];
        int i = 0;
        int max = a[0];
//        System.out.println("Minimum number of array :"+r.min(a,min,i));
//        System.out.println("Maximum Number of array :"+r.max(a,max,i));
//
//       r.traverse(a,i);
        recursion list = new recursion();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        r.traverseLL(head);

    }

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void traverseLL(Node head) {
        Node temp =head;
        if (temp == null) {
            return;
        }
        System.out.println(temp.data);
        traverseLL(temp.next);
    }

    public void traverse(int[] a, int i) {
        if (i == a.length) {
            return;
        }
        System.out.println(a[i]);
        traverse(a, ++i);
    }

    public void even(int n) {
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n);
        }
        even(n - 1);
    }

    public void odd(int n) {
        if (n == 0) {
            return;
        }
        odd(n - 1);

        if (n % 2 != 0) {
            System.out.println(n);
        }
    }

    public int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);

    }

    int count = 0;

    public int fun(int n) {

        if (n == 0) {
            return 0;
        }
//        n = n/10;
//        count++;
//        fun(n);
//        return count;
        return 1 + fun(n / 10);
    }

    public int addition(int num) {
        int add = 0;
        while (num > 0) {
            int val = num % 10;
            add += val;
            num = num / 10;
        }
        return add;
    }

    public int fibbo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibbo(n - 1) + fibbo(n - 2);
    }

    public int min(int[] a, int min, int i) {
        if (i == a.length - 1) {
            return min;
        }
//        if(min>a[i]){
//            min=a[i];
//        }
        min = Math.min(min, a[i]);
        return min(a, min, ++i);
    }

    public int max(int[] a, int max, int i) {
        if (i == a.length - 1) {
            return max;
        }
//        if(max<a[i]){
//            max=a[i];
//        }
        max = Math.max(max, a[i]);
        return max(a, max, ++i);
    }


}
