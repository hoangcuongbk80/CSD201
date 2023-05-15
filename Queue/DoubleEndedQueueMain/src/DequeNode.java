public class DequeNode<T> {
    private T data;
    private DequeNode<T> next;
    private DequeNode<T> prev;

    public DequeNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DequeNode<T> getNext() {
        return next;
    }

    public void setNext(DequeNode<T> next) {
        this.next = next;
    }

    public DequeNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DequeNode<T> prev) {
        this.prev = prev;
    }
}
