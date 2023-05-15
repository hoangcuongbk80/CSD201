public class ArrayQueueMain {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);

        try {
            queue.enqueue("A");
            queue.enqueue("B");
            queue.enqueue("C");
            queue.enqueue("D"); // should trigger the 'grow' method

            System.out.println(queue.front()); // should print 'A'
            System.out.println(queue.dequeue()); // should print 'A'
            System.out.println(queue.dequeue()); // should print 'B'
            System.out.println(queue.dequeue()); // should print 'C'
            System.out.println(queue.dequeue()); // should throw an exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
