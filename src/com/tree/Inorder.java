package com.tree;

import java.util.Random;

public  class Inorder {
    public static void main(String[] args) {
        Inorder order = new Inorder();
        order.root = new TreeNode(20);
        order.root.left = new TreeNode(13);
        order.root.left.left = new TreeNode(7);
        order.root.right = new TreeNode(10);
//        order.root.left.right = new TreeNode(6);
        System.out.println("inOrder formate :");
        order.inorder(order.root);
        System.out.println("preOreder formate :");
        order.preOrder(order.root);
        System.out.println("postOrder formate :");
        order.postOrder(order.root);
        System.out.println("Larger Element:");
        System.out.println(order.largerElement(order.root));
        System.out.println("Smaller Element:");
        System.out.println(order.smallerElement(order.root));
        System.out.println("Check  Element:");
        System.out.println(order.checkElement(order.root,4));
        System.out.println("Check  Element in BST:");
        System.out.println(order.search(order.root,3));
        System.out.println("inserting Element intp BST:");
        TreeNode root2 = null;

        order.insert(20);
        order.insert(33);

        System.out.println(order.insert(30));
        System.out.println(order.insert(40));
        System.out.println(order.insert(20));

    }

    TreeNode root = null;

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.data);
    }


    int largerElement(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        int leftVal = largerElement(root.left);
        int rightVal = largerElement(root.right);
        if (leftVal > max) {
            max = leftVal;
        } else if (rightVal > max) {
            max = rightVal;
        }
        return max;
    }

    int smallerElement(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int min = root.data;
        int leftData =smallerElement(root.left);
        int rightData =smallerElement(root.right);
        if(min>leftData){
            min=leftData;
        }
        if(min>rightData){
            min=rightData;
        }
        return min;
    }

    boolean checkElement(TreeNode root, int n){
        if (root==null){
            return false;
        }
        if(n==root.data){
            return true;
        }
       return checkElement(root.left,n) ||  checkElement(root.right,n);
    }

    //BST

    public boolean search(TreeNode root, int x){
        if(root ==null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        if (x < root.data){
            return search(root.left,x);
        }
        return search(root.right,x);
    }


    public TreeNode insert(int n){
        TreeNode root2= null;
        return insertRecord(root2,n);

    }

    public TreeNode insertRecord(TreeNode root2, int n){
        if(root2 == null){
             root2=new TreeNode(n);
             return root2;
        }
        if(n < root2.data){
             insertRecord(root2.left,n);
        }
        if(n> root2.data) {
            insertRecord(root2.right, n);
        }
        return root2;
    }


}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
