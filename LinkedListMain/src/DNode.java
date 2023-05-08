public class DNode<T> {
    public T data;
    public DNode<T> next;
    public DNode<T> prev;

    public DNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}