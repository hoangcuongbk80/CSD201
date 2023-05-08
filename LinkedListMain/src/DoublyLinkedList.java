public class DoublyLinkedList<T> {
    private DNode<T> head;
    private DNode<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getSize() {
        return this.size;
    }

    public void insertAtHead(T data) {
        DNode<T> newNode = new DNode<>(data);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

        this.size++;
    }

    public void insertAtTail(T data) {
        DNode<T> newNode = new DNode<>(data);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }

        this.size++;
    }

    public void insertAtPosition(T data, int position) {
        if (position < 0 || position > this.size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            insertAtHead(data);
        } else if (position == this.size) {
            insertAtTail(data);
        } else {
            DNode<T> newNode = new DNode<>(data);
            DNode<T> current = this.head;

            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }

            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;

            this.size++;
        }
    }

    public void deleteAtHead() {
        if (!isEmpty()) {
            this.head = this.head.next;
            if (this.head != null) {
                this.head.prev = null;
            } else {
                this.tail = null;
            }
            this.size--;
        }
    }

    public void deleteAtTail() {
        if (!isEmpty()) {
            if (this.head.next == null) {
                this.head = null;
                this.tail = null;
            } else {
                this.tail = this.tail.prev;
                this.tail.next = null;
            }
            this.size--;
        }
    }

    public void printList() {
        if (!isEmpty()) {
            DNode<T> current = this.head;

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }
}
