package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {
        // ToDo 1: complete InOrder Traversal
        if (root == null)
            return;
        
        doInOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        doInOrder(root.getRight());
    }
    
    public void preOrderTraversal() {
        doPreOrder(this.root);
        // ToDo 2: complete the pre-order travesal . 
    }
    
    private void doPreOrder(BstNode root) {
        if (root == null)
            return;
        
        System.out.print(root.getData() + " ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }
    
    // ToDo 3: Find the height of a tree
    public Integer findHeight() {
        return doFindHeight(this.root);
    }
    
    public Integer doFindHeight(BstNode root) {
        int leftH, rightH;
        if (root == null)
            return -1;
        
        leftH = doFindHeight(root.getLeft());
        rightH = doFindHeight(root.getRight());
        
        return Math.max(leftH, rightH) + 1;
    }

    
    //ToDo 4: complete getDepth of a node 
    public int getDepth(int data) {
       return doGetDepth(this.root, data, 0);
    }
    
    private int doGetDepth(BstNode root, int data, int depth) {
        int leftD, rightD;
        
        if (root == null)
            return -1;
        
        if (root.getData() == data)
            return depth;
        
        leftD = doGetDepth(root.getLeft(), data, depth+1);
        rightD = doGetDepth(root.getRight(), data, depth+1);
        
        if (leftD != -1) 
            return leftD;
        
        if (rightD != -1)
            return rightD;
        
        return -1;
    }
    
    
   public void print() {
       System.out.println("\n==== BST Print ===== \n");
       doPrint(" ", root, false);
        // ToDo 5: complete the print of the BST
    }
   
   private void doPrint(String s, BstNode node, boolean isLeft) {
       if (node == null)
           return;
       
       if (node != root) {
           System.out.println(s+(isLeft ? "/-- " : "\\-- ")+node.getData());
       }
       else {
           System.out.println(node.getData() + "--");
       }
       
       doPrint(s + (isLeft ? "|   " : "    "), node.getLeft(), true);
       doPrint(s + (isLeft ? "|   " : "    "), node.getRight(), false);
   }

}