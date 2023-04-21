/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_bst_example;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    public static void main(String a[]) {
 
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("\n-------------------");
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        
        System.out.println("\n-------------------");
        System.out.println("Pre Order Traversal");
        bst.preOrderTraversal();
        
        System.out.println("\n-------------------");
        System.out.println("Finding Height");
        System.out.println("Height: " + bst.findHeight());
        
        System.out.println("\n-------------------");
        System.out.println("Finding Depth of node: 10");
        System.out.println("Depth: " + bst.getDepth(10));

        bst.print();
    }
}
