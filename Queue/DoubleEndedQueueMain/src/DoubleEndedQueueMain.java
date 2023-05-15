/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
public class DoubleEndedQueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        
        // Inserting elements at front and rear
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);
        deque.addLast(40);
        
        System.out.println("Deque size: " + deque.size());
        System.out.println("Front element: " + deque.first());
        System.out.println("Rear element: " + deque.last());
        
        // Removing elements from front and rear
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
    
}
