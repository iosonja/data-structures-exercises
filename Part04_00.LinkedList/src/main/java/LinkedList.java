/**
 *
 * @author sonjaek
 */
public class LinkedList {
    
    private int length;
    private Node head;
    private Node tail;

    public LinkedList(int n) {
        this.length = n;
        
        Node firstNode = new Node(1);
        this.head = firstNode;
        this.tail = firstNode;
    }
    
    public class Node {
    
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
        public void setNext(Node x) {
            this.next = x;
        }
    }
    
    public void addNumbers() {
        long startTime = System.nanoTime();
        for (int i = 2; i < this.length; i++) {
            Node newNode = new Node(i);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        long executionTime = System.nanoTime() - startTime;
        System.out.println("Adding the numbers took " + executionTime / 1000000000.00 
                + " seconds.");
    }
    
    public void deleteNumbers() {
        long startTime = System.nanoTime();
        if (this.length == 0) {
            return;
        }
        for (int i = 1; i < this.length; i++) {
            this.head = this.head.next;
        }
        long executionTime = System.nanoTime() - startTime;
        System.out.println("Deleting the numbers took " + executionTime / 1000000000.00 
                + " seconds.");
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList(100000);
        ll.addNumbers();
        ll.deleteNumbers();
    }
}
