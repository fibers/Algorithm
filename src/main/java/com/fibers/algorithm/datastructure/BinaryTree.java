package com.fibers.algorithm.datastructure;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T> {
    TreeNode<T> root;


    public BinaryTree(T[] t) {

        root = createBinaryTreeByArray(t, 0);
    }

    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F", "G"};
        BinaryTree<String> bt = new BinaryTree<String>(array);
        bt.breadthFirstTravel();
        bt.preOrderTravel();
        bt.postOrderTravel();
    }

    private TreeNode<T> createBinaryTreeByArray(T[] t, int index) {
        TreeNode<T> tn = null;
        int len = t.length;
        if (len > 0 && index < len) {
            tn = new TreeNode<T>(t[index]);
            tn.left = createBinaryTreeByArray(t, 2 * index + 1);
            tn.right = createBinaryTreeByArray(t, 2 * index + 2);
        }

        return tn;
    }

    void breadthFirstTravel() {
        Queue<TreeNode<T>> q = new LinkedList<>();
        q.add(this.root);
        while (!q.isEmpty()) {
            TreeNode<T> temp = ((LinkedList<TreeNode<T>>) q).pop();
            System.out.print(temp.value);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        System.out.println();
    }

    void preOrderTravel() {
        Stack<TreeNode<T>> s = new Stack<TreeNode<T>>();
        s.push(this.root);
        while (!s.isEmpty()) {
            TreeNode<T> temp = s.pop();
            System.out.print(temp.value);
            if (temp.right != null) {
                s.push(temp.right);
            }
            if (temp.left != null) {
                s.push(temp.left);
            }
        }
        System.out.println();
    }

    void postOrderTravel() {
        Stack<TreeNode<T>> s = new Stack<TreeNode<T>>();
        Stack<TreeNode<T>> s1 = new Stack<TreeNode<T>>();
        s.push(this.root);
        while (!s.isEmpty()) {
            TreeNode<T> temp = s.pop();
            s1.push(temp);
            if (temp.left != null) {
                s.push(temp.left);
            }
            if (temp.right != null) {
                s.push(temp.right);
            }
        }

        while(!s1.isEmpty()){
            TreeNode<T> temp = s1.pop();
            System.out.print(temp.value);
        }

        System.out.println();
    }

    void midOrderTravel(){

    }



    class TreeNode<T> {
        T value;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode(T t) {
            this.value = t;
        }
    }

}
