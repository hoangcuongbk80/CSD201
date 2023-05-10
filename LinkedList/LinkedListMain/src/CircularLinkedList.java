public class CircularLinkedList<T> {
    private Node head;
    private Node tail;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

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

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

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
        Node<T> current = head;

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
