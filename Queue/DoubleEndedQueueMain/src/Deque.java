public class Deque<T> {
    private DequeNode<T> front;
    private DequeNode<T> rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(T data) {
        DequeNode<T> newNode = new DequeNode<T>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.setNext(front);
            front.setPrev(newNode);
            front = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        DequeNode<T> newNode = new DequeNode<T>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.setPrev(rear);
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        } else {
            front.setPrev(null);
        }
        size--;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        T data = rear.getData();
        rear = rear.getPrev();
        if (rear == null) {
            front = null;
        } else {
            rear.setNext(null);
        }
        size--;
        return data;
    }

    public T first() {
        if (isEmpty()) {
            return null;
        }
        return front.getData();
    }

    public T last() {
        if (isEmpty()) {
            return null;
        }
        return rear.getData();
    }
}
