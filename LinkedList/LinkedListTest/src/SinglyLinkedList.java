public class SinglyLinkedList {
    Node head, tail;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }
    boolean isEmpty(){
        return head == null;
    }
    void clearSinglyList(){
        this.head = null;
        this.tail = null;
    }
    void addToHead(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            tail = newNode;
            head = newNode;
        }else{
            newNode.next = head;
            this.head = newNode;
        }
    }
    void printList(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.print(currentNode.info + " ");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }
}
