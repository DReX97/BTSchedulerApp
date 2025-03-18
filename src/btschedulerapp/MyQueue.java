/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;
import java.util.ArrayList;
/**
 *
 * @author damie
 */
public class MyQueue implements QueueInterface{
        //ArrayList to hold the queue items (I used this for no-show/absents)
    private ArrayList<String> theQueue;

    //Constructor
    public MyQueue() {
        theQueue = new ArrayList<String>(); // Initialize the queue as empty.
    }

    //checks if the queue is empty.
    public boolean isEmpty() {
        return theQueue.isEmpty(); // Returns true if there are no elements.
    }

    //returns the size of the queue.
    public int size() {
        return theQueue.size();
    }

    // Returns the element at the front of the queue without removing it.
    public Object frontElement() {
        if (theQueue.size() > 0) { //Checks if the queue has any elements.
            return theQueue.get(0); //Return the first element.
        } else {
            return null; //return null if it's empty
        }
    }

    //adds new element to the queue
    public void enqueue(Object element) {
        //If the queue already has 5 or more items
        if (theQueue.size() >= 5) {
            theQueue.remove(0); //Remove the oldest element.
        }
        theQueue.add((String) element); //adds new element to the end of the queue.
    }

    //Removes and returns the element at the front of the queue.
    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove(0); //Remove and return the first element.
        } else {
            return null;
        }
    }
}
