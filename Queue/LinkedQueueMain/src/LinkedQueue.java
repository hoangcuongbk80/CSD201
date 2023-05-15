public class LinkedQueue{ 
  
    private static class Node{ 
        public Object info;
        public Node  next;
        public Node(Object x, Node p)
            { info=x; next=p; }
        public Node(Object x)
            { this(x,null); }
    };

    protected Node head,tail;

    public LinkedQueue() 
      { head = tail = null; }

    public boolean isEmpty()
      { return(head==null);}

    Object front() throws Exception{ 
        if(isEmpty()) throw new Exception();
        return(head.info);
      }
    public Object dequeue() throws Exception{ 
        if(isEmpty()) throw new Exception();
        Object x = head.info;
        head=head.next;
        if(head==null) tail=null;
            return(x);
    }

    void enqueue(Object x){ 
        if(isEmpty())
        head = tail = new Node(x);
        else{ 
            tail.next = new Node(x);
            tail = tail.next;
        }
    }
}
