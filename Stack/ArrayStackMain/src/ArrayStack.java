import java.util.EmptyStackException;

public class ArrayStack {
    private Object[] a;
    private int top;
    private int max;

    public ArrayStack() {
        this(50);
    }

    public ArrayStack(int max1) {
        max = max1;
        a = new Object[max];
        top = -1;
    }

    protected boolean grow() {
        int max1 = max + max/2;
        Object[] a1 = new Object[max1];
        if (a1 == null) return false;
        System.arraycopy(a, 0, a1, 0, top+1);
        a = a1;
        return true;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max-1;
    }

    public void clear() {
        top = -1;
    }

    public void push(Object x) {
        if (isFull() && !grow()) return;
        a[++top] = x;
    }

    public Object top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return a[top];
    }

    public Object pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        Object x = a[top];
        top--;
        return x;
    }
}
