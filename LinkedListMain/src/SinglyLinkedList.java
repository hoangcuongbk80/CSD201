public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
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

        newNode.next = this.head;
        this.head = newNode;

        this.size++;
    }

    public void insertAtTail(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            this.head = newNode;
        } else {
            Node<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        this.size++;
    }

    public void insertAtPosition(T data, int position) {
        if (position < 0 || position > this.size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            insertAtHead(data);
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = this.head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            this.size++;
        }
    }

    public void deleteAtHead() {
        if (!isEmpty()) {
            this.head = this.head.next;
            this.size--;
        }
    }

    public void deleteAtTail() {
        if (!isEmpty()) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node<T> current = this.head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            this.size--;
        }
    }

    public void printList() {
        if (!isEmpty()) {
            Node<T> current = this.head;

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }
}
