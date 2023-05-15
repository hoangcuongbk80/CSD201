public class LinkedListMain_Int {

    public static void main(String[] args) {
        // SinglyLinkedList        
        SinglyLinkedList slist = new SinglyLinkedList();

        slist.addFirst(3);
        slist.addFirst(2);
        slist.addLast(4);
        slist.addLast(5);

        slist.printList(); // Output: 2 3 4 5
        
        // CircularLinkedList
        CircularLinkedList clist = new CircularLinkedList();

        clist.addFirst(3);
        clist.addFirst(2);
        clist.addLast(4);
        clist.addLast(5);

        clist.printList(); // Output: 2 3 4 5
        
        // DoublyLinkedList
        DoublyLinkedList dlist = new DoublyLinkedList();

        dlist.addFirst(3);
        dlist.addFirst(2);
        dlist.addLast(4);
        dlist.addLast(5);

        dlist.printList(); // Output: 2 3 4 5
    
    }  
}
