public class CircularLinkedList<T> {
    private Node<T> head;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getSize() {
        return this.size;
    }

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            newNode.next = newNode;
        } else {
            newNode.next = this.head.next;
        }

        this.head = newNode;
        this.size++;
    }

    public void insertAtTail(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            newNode.next = newNode;
            this.head = newNode;
        } else {
            newNode.next = this.head.next;
            this.head.next = newNode;
            this.head = newNode;
        }

        this.size++;
    }

    public void deleteAtHead() {
        if (!isEmpty()) {
            if (this.head.next == this.head) {
                this.head = null;
            } else {
                this.head.next = this.head.next.next;
            }

            this.size--;
        }
    }

    public void printList() {
        if (!isEmpty()) {
            Node<T> current = this.head.next;

            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != this.head.next);

            System.out.println();
        }
    }
}