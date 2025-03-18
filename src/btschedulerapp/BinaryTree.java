/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;

/**
 *
 * @author damie
 */
public class BinaryTree {
    public BTNode theRoot; //root node of the tree.

    // Constructor
    public BinaryTree() {
        theRoot = null;
    }

    //returns the root of the tree.
    public BTNode root() {
        return theRoot;
    }

    //checks if the tree is empty.
    public boolean isEmpty() {
        return theRoot == null;
    }

    //Recursively inserts a new node into the tree.
    //The tree is ordered by patient ID.
    public void insertNode(BTNode startNode, BTNode newNode) {
        if (theRoot == null) {
            //if the tree is empty, set newNode as the root.
            theRoot = newNode;
        } else {
            if (newNode.getPatientID() > startNode.getPatientID()) {
                //if new node's ID is larger, insert into the right subtree.
                if (startNode.getRight() == null) {
                    startNode.setRight(newNode);
                } else {
                    insertNode(startNode.getRight(), newNode);
                }
            } else if (newNode.getPatientID() < startNode.getPatientID()) {
                //if new node's ID is smaller, insert into the left subtree.
                if (startNode.getLeft() == null) {
                    startNode.setLeft(newNode);
                } else {
                    insertNode(startNode.getLeft(), newNode);
                }
            } else {
                //duplicate IDs should not happen so print out a warning.
                System.out.println("Patient with ID " + startNode.getPatientID() + " already exists.");
            }
        }
    }

    //Recursively searches for a patient node by patient ID.
    //Returns the node if found or null if it's not found.
    public BTNode search(int patientID, BTNode startNode) {
        if (startNode == null) {
            return null; //Not found...
        } else if (patientID == startNode.getPatientID()) {
            return startNode; //found it!
        } else if (patientID < startNode.getPatientID()) {
            return search(patientID, startNode.getLeft());//Search left.
        } else {
            return search(patientID, startNode.getRight());//Search right.
        }
    }

    //in-order traversal: visits left subtree, then current node, then right subtree.
    //This would be useful for displaying patient records in sorted order.
    public void inOrderTraversal(BTNode startNode) {
        if (startNode == null) return;
        inOrderTraversal(startNode.getLeft());
        System.out.println("Patient ID: " + startNode.getPatientID() +
                           ", Name: " + startNode.getPatient().getsName());
        inOrderTraversal(startNode.getRight());
    }
    
    //Pre-order traversal (Root, Left, Right).
    public void preOrderTraversal(BTNode startNode) {
        if (startNode == null) {
            return;
        }
        System.out.println("Current patient ID: " + startNode.getPatientID() +
                           ", Name: " + startNode.getPatient().getsName());
        preOrderTraversal(startNode.getLeft());
        preOrderTraversal(startNode.getRight());
    }

    //post-order traversal (Left, Right, Root).
    public void postOrderTraversal(BTNode startNode) {
        if (startNode == null) {
            return;
        }
        postOrderTraversal(startNode.getLeft());
        postOrderTraversal(startNode.getRight());
        System.out.println("Current patient ID: " + startNode.getPatientID() +
                           ", Name: " + startNode.getPatient().getsName());
    }

    //Recursively counts the number of nodes in the tree.
    public int countNodes(BTNode startNode) {
        if (startNode == null) {
            return 0;
        } else {
            return 1 + countNodes(startNode.getLeft()) + countNodes(startNode.getRight());
        }
    }

    // Recursively calculates the height of the tree.
    public int height(BTNode startNode) {
        if (startNode == null) {
            return -1;
        } else {
            int leftHeight = height(startNode.getLeft());
            int rightHeight = height(startNode.getRight());
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
