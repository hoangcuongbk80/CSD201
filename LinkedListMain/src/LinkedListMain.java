public class LinkedListMain {

    public static void main(String[] args) {
        
        // SinglyLinkedList
        
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        
        list.insertAtHead(3);
        list.printList();
        list.insertAtHead(2);
        list.printList();
        list.insertAtHead(1);
        
        list.insertAtTail(4);
        list.printList();
        list.insertAtTail(5);        
        list.printList(); // 1 2 3 4 5
        
        list.insertAtPosition(4, 3);
        list.printList();
        
        list.deleteAtHead();
        list.deleteAtTail();
        list.printList(); // 2 3 4
        
        // CircularLinkedList
        
        CircularLinkedList<Integer> CirList = new CircularLinkedList<>();

        CirList.insertAtHead(3);
        CirList.insertAtHead(2);
        CirList.insertAtHead(1);
        CirList.insertAtTail(4);
        CirList.printList(); // 1 2 3 4

        CirList.deleteAtHead();
        CirList.deleteAtHead();
        CirList.printList(); // 3 4
        
        // DoublyLinkedList
        
        DoublyLinkedList<Integer> dlist = new DoublyLinkedList<>();

        dlist.insertAtHead(3);
        dlist.insertAtHead(2);
        dlist.insertAtHead(1);
        list.printList(); // Output: 1 2 3

        dlist.insertAtTail(4);
        dlist.insertAtTail(5);
        dlist.printList(); // Output: 1 2 3 4 5

        dlist.insertAtPosition(0, 0);
        dlist.insertAtPosition(6, 6);
        dlist.insertAtPosition(100, 3);
        dlist.printList(); // Output: 0 1 2 100 3 4 5 6

        dlist.deleteAtHead();
        dlist.deleteAtTail();
        dlist.printList(); // Output: 1 2 100 3 4
    }
    
}
