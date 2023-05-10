public class LinkedListMain {

    public static void main(String[] args) {
        
        // SinglyLinkedList
        
        SinglyLinkedList<Integer> slist = new SinglyLinkedList<>();

        slist.addFirst(3);
        slist.addFirst(2);
        slist.addFirst(1);
        slist.printList(); // prints: 1 2 3

        slist.addLast(4);
        slist.addLast(5);
        slist.addLast(6);
        slist.printList(); // prints: 1 2 3 4 5 6

        slist.removeFirst();
        slist.printList(); // prints: 2 3 4 5 6
        
        // CircularLinkedList
        
        CircularLinkedList<Integer> clist = new CircularLinkedList<>();

        clist.addFirst(3);
        clist.addFirst(2);
        clist.addLast(4);
        clist.addLast(5);

        clist.printList(); // Output: 2 3 4 5
        
        // DoublyLinkedList
        
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addFirst(3);
        list.addFirst(2);
        list.addLast(4);
        list.addLast(5);

        list.printList(); // Output: 2 3 4 5
    }
    
}
