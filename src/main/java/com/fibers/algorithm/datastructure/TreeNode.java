package com.fibers.algorithm.datastructure;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int t) {
        this.val = t;
    }

    public TreeNode(Integer[] t) {
        if (t == null || t.length == 0) {
            return;
        }

        this.val = t[0];
        this.left = createBinaryTreeByArray(t, 1);
        this.right = createBinaryTreeByArray(t, 2);
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, null, 5, 6, 7, null, null, null, null, 12, 13};
        TreeNode t = new TreeNode(array);
        t.breadthFirstTravel();
        t.preorderTraversal();
        t.inorderTraversal();
        t.postorderTraversal();
        t.leftView();
        t.rightView();
    }

    private TreeNode createBinaryTreeByArray(Integer[] t, int index) {
        TreeNode tn = null;
        int len = t.length;
        if (len > 0 && index < len && t[index] != null) {
            tn = new TreeNode(t[index]);
            tn.left = createBinaryTreeByArray(t, 2 * index + 1);
            tn.right = createBinaryTreeByArray(t, 2 * index + 2);
        }

        return tn;
    }

    public void breadthFirstTravel() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(this);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.print(temp.val);
            System.out.print(",");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        System.out.println();
    }

    public void preorderTraversal() {
        Stack<TreeNode> s = new Stack<>();
        s.push(this);
        while (!s.isEmpty()) {
            TreeNode temp = s.pop();
            System.out.print(temp.val);
            System.out.print(",");
            if (temp.right != null) {
                s.push(temp.right);
            }
            if (temp.left != null) {
                s.push(temp.left);
            }
        }
        System.out.println();
    }

    public void postorderTraversal() {
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> s1 = new Stack<>();
        s.push(this);
        while (!s.isEmpty()) {
            TreeNode temp = s.pop();
            s1.push(temp);
            if (temp.left != null) {
                s.push(temp.left);
            }
            if (temp.right != null) {
                s.push(temp.right);
            }
        }

        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            System.out.print(temp.val);
            System.out.print(",");
        }

        System.out.println();
    }

    public void inorderTraversal() {
        Stack<TreeNode> s = new Stack<>();
        TreeNode t = this;

        while (t != null || !s.isEmpty()) {
            while (t != null) {
                s.push(t);
                t = t.left;
            }

            if (!s.isEmpty()) {
                TreeNode temp = s.pop();
                System.out.print(temp.val);
                System.out.print(",");

                if (temp.right != null) {
                    t = temp.right;
                }
            }
        }

        System.out.println();

    }

    public void leftView() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(this);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (i == 0) {
                    System.out.print(current.val);
                    System.out.print(",");
                }
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }

        System.out.println();
    }


    public void rightView() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(this);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode current = null;
            for (int i = 0; i < size; i++) {
                current = q.poll();
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
            System.out.print(current.val);
            System.out.print(",");
        }

        System.out.println();
    }

    public TreeNode nearestAncestor(TreeNode root, TreeNode t1, TreeNode t2) {
        if (root == null || t1 == null || t2 == null) {
            return null;
        }

        if (t1 == root || t2 == root) {
            return root;
        }

        TreeNode l = nearestAncestor(root.left, t1, t2);
        TreeNode r = nearestAncestor(root.right, t1, t2);

        if (l != null && r != null) {
            return root;
        }

        if (l == null) {
            return r;
        } else {
            return l;
        }

    }
}
