/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;

/**
 *
 * @author damie
 */
public class BTNode {
    private Patient pRecord;//holds the patient record for this node
    private BTNode leftChild;
    private BTNode rightChild;

    // Constructor
    public BTNode(Patient pRecord){
        this.pRecord = pRecord;  // Set the patient record
        leftChild = null;        // Initially, no left child
        rightChild = null;       // Initially, no right child
    }
    
    //returns the patient record stored in this node
    public Patient getPatient() {
        return pRecord;
    }

    //returns the patient ID from the patient record
    public int getPatientID(){
        return pRecord.getPatientID();
    }
    
    //returns the left child 
    public BTNode getLeft() {
        return leftChild;
    }

    //sets the left child 
    public void setLeft(BTNode inNode) {
        leftChild = inNode;
    }

    //returns the right child 
    public BTNode getRight() {
        return rightChild;
    }

    //sets the right child 
    public void setRight(BTNode inNode) {
        rightChild = inNode;
    }
    
    //checks if this leaf have no children
    public boolean isLeaf(){
        return (leftChild == null && rightChild == null);
    }
    
    //checks if this node has at least one child
    public boolean isInternal() {
        return (leftChild != null) || (rightChild != null);
    }

    //checks if this leaf have no children
    public boolean isExternal() {
        return isLeaf();
    }
}
