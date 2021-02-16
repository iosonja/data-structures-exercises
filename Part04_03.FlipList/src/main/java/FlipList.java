/**
Tehtäväsi on toteuttaa oma tehokas tietorakenne kääntölista, joka tarjoaa seuraavat toiminnot:
Lisää alkio listan loppuun
Palauta ja poista alkio listan lopusta
Lisää alkio listan alkuun
Palauta ja poista alkio listan alusta
Käännä listan sisältö
        
 *
 * @author sonjaek
 */
public class FlipList {
    
    private Node head;
    private Node tail;

    public FlipList() {
        Node firstNode = new Node(1);
        this.head = firstNode;
        this.tail = firstNode;
    }
    
    public class Node {
    
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        
        public void setNext(Node x) {
            this.next = x;
        }
        
        public void setPrevious(Node x) {
            this.previous = x;
        }
        
    }
    
    public void pushLast(int x) {
        Node newNode = new Node(x);
        this.tail.setNext(newNode);
    }

    public void pushFirst(int x) {
        Node newNode = new Node(x);
        this.head.setPrevious(newNode);
        newNode.setNext(head);
        this.head = newNode;
    }

    public int popLast() {
        return this.tail.data;
    }

    public int popFirst() {
        return this.head.data;
    }

    public void flip() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }

    public static void main(String[] args) {
        FlipList f = new FlipList();
        f.pushLast(1);
        f.pushLast(2);
        f.pushLast(3);
        System.out.println(f.popFirst()); // 1
        f.flip();
        System.out.println(f.popFirst()); // 3
    }
}
