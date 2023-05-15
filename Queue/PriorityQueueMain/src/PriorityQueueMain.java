/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
public class PriorityQueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayPriorityQueue queue = new ArrayPriorityQueue(5);
        
        // Test isEmpty() and isFull()
        System.out.println(queue.isEmpty());  // should print true
        System.out.println(queue.isFull());   // should print false
        
        // Test enqueue()
        queue.enqueue(3.0f);
        queue.enqueue(1.0f);
        queue.enqueue(4.0f);
        queue.enqueue(1.5f);
        queue.enqueue(2.0f);
        
        // Test front() and dequeue()
        System.out.println(queue.front());    // should print 4.0
        System.out.println(queue.dequeue());  // should print 4.0
        System.out.println(queue.front());    // should print 3.0
        System.out.println(queue.dequeue());  // should print 3.0
        
        // Test clear()
        queue.clear();
        System.out.println(queue.isEmpty());  // should print true
    }
    
}
