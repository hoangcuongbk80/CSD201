public class ArrayQueue
{ 
    protected Object [] a;
    protected int max;
    protected int first, last;

    public ArrayQueue() 
      { this(10);
      }
    
    public ArrayQueue(int max1) 
      { max = max1;
        a = new Object[max];
        first = last = -1;
      }
    
    public boolean isEmpty()
      { return(first==-1);}

    public boolean isFull()
      { return((first == 0 && 
        last == max-1) || first == last+1);
      }

    private boolean grow()
       { int i,j;
         int max1 = max + max/2;
         Object [] a1 = new Object[max1];
         if(a1 == null) return(false);
         if(last>=first)
           for(i=first;i<=last;i++) a1[i-first]=a[i];
           else
           { for(i=first;i<max;i++) a1[i-first]=a[i];
             i = max-first;
             for(j=0;j<=last;j++) a1[i+j]=a[j];
           }
         a = a1;
         first = 0;         
         last = max-1;
         max = max1;
         return(true); 
       }

    void enqueue(Object x)
      { if(isFull() && !grow()) return;
        if(last == max-1 || last == -1)
           { a[0] = x; last=0;
             if(first==-1) first = 0;
           }
          else   a[++last] = x;
      }
    Object front() throws Exception
      { if(isEmpty()) throw new Exception();
        return(a[first]);
      }
    public Object dequeue() throws Exception
      { if(isEmpty()) throw new Exception();
        Object x = a[first];
        if(first == last)	// only one element
           {first = last = -1;}
           else if(first==max-1)
             first = 0;
             else
             first++;
        return(x);
      }
}                       