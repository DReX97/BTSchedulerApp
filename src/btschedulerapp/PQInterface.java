/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;

/**
 *
 * @author damie
 */
public interface PQInterface {
    //Inserts a new element into the priority queue based on its priority key.
    public void enqueue(int iPriorityKey, Object thePatient);

    //Removes and returns the element with the highest priority from the queue.
    public Object dequeue();

    //Returns the number of elements in the priority queue.
    public int size();

    //Checks if the priority queue is empty.
    public boolean isEmpty();

    //Returns a string representation of the entire priority queue.
    public String printPQueue();
    
    //Retrieves a string representation of the highest priority element without removing it.
    public String getHighPriority();
    
}
