public class CircularLinkedList {
    private Node head;
    private Node tail;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void printList() {
        Node current = head;

        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);

            System.out.println();
        }
    }
}
