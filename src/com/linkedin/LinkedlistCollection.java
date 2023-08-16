package com.linkedin;

import java.util.*;

class LinkedlistCollection {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("I");
        list.add("am");
        list.addLast("Suhag");
        list.addFirst("hey");
        list.add(3, "Mohinkar");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
