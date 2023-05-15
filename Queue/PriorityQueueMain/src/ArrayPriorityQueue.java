class ArrayPriorityQueue
  { protected  float [] a; int top, max;
    public ArrayPriorityQueue() 
      { this(50);
      }
    public ArrayPriorityQueue(int max1) 
      { max = max1;
        a =  new float[max];
        top = -1;
      }
    protected  boolean grow()
      { int max1 = max + max/2;
        float [] a1 = new float[max1];
        if(a1 == null) return(false);
        for(int i =0; i<=top; i++)
             a1[i] = a[i];
         a = a1;
        return(true);
      }
    public boolean isEmpty()
      { return(top==-1);}
    public boolean isFull()
      { return(top==max-1);}
    public void clear()
      { top=-1;}
    public void enqueue(float x)
      { if(isFull() && !grow()) return;
        if(top==-1)
           { a[0] = x; top = 0;
             return;
           }
        int i = top; 
        while(i>=0 && x<a[i]) 
           {  a[i+1] = a[i];
              i--;
            }      
        a[i+1] = x;  top++;
      }
        public float front()
      { assert(!isEmpty());
        return(a[top]);
      }

    public float dequeue()
     {assert(!isEmpty());
        float x = a[top];
        top--;
        return(x);
      }
}

