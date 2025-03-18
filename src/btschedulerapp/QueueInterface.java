/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;

/**
 *
 * @author damie
 */
public interface QueueInterface {
    // Checks if the queue is empty.
    public boolean isEmpty();

    // Returns the number of elements in the queue.
    public int size();

    // Returns the element at the front of the queue without removing it.
    public Object frontElement();

    // Adds a new element to the queue.
    public void enqueue(Object element);

    // Removes and returns the element at the front of the queue.
    public Object dequeue();
    
}
