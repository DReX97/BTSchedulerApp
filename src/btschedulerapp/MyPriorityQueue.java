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
public class MyPriorityQueue implements PQInterface{
    //ArrayList to hold the priority queue elements (PQElement objects)
    private ArrayList<PQElement> thePQueue;

    // Constructor: Initialize the priority queue as an empty ArrayList
    public MyPriorityQueue() {
        thePQueue = new ArrayList<>();
    }

    @Override
    // Check if the priority queue is empty (returns true if no elements)
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    // Return the number of elements in the priority queue
    public int size() {
        return thePQueue.size();
    }

    @Override
    // Enqueue a new patient into the priority queue based on the given priority key
    public void enqueue(int iPriorityKey, Object thePatient) {
        int iIndex;
        // Create a new PQElement with the given priority and cast the object to Patient
        PQElement newElement = new PQElement(iPriorityKey, (Patient) thePatient);
        // Find the correct insert position in the queue based on the priority key
        iIndex = findInsertPosition(iPriorityKey);

        // If the insert index is greater than the size, add to the end; otherwise, insert at the index
        if (iIndex > size()) {
            thePQueue.add(newElement);
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }

    // Dummy explanation: Find the right position to insert a new element based on its priority key
    private int findInsertPosition(int iNewPriorityKey) {
        boolean bFound = false;
        int iPosition = 0;
        PQElement curElement;
        // Loop through the queue until the correct position is found
        while (iPosition < thePQueue.size() && !bFound) {
            curElement = thePQueue.get(iPosition);
            // If the current element's priority key is greater than the new key, move to next position
            if (curElement.getiKey() > iNewPriorityKey) {
                iPosition = iPosition + 1;
            } else {
                // Position found when current key is not greater than new key
                bFound = true;
            }
        }
        return iPosition; // Return the determined insert position
    }

    @Override
    // Remove and return the element with the highest priority (assumed to be at index 0)
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    @Override
    // Create and return a string representing all elements in the priority queue
    public String printPQueue() {
        String sMessage = "";
        // Loop through every element in the queue
        for (int iCount = 0; iCount < size(); iCount++) {
            // Get the details of the patient from the current PQElement
            String sDetails = thePQueue.get(iCount).printPatient();
            // Convert the priority key to a string
            String sPriority = Integer.toString(thePQueue.get(iCount).getiKey());
            // Append the patient details and their priority to the message
            sMessage += sDetails + "\n|Patient's Priority Level: " + sPriority + "\n";
        }
        return sMessage; // Return the complete message with all patients
    }

    // Return a string representing the highest priority patient (first element in the queue)
    public String getHighPriority() {
        String sMessage = thePQueue.get(0).printPatient();
        return sMessage;
    }
    
}
