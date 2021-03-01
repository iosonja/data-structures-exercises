/**
 * The program counts the difference between the number of child nodes on the 
 * right and left side of the given node.
 * @author sonjaek
 */
public class Subtrees {
    
    public int count(Node node) {
        if (node == null) {
            return 0;
        }
        return count(node.left) + count(node.right) + 1; 
    }
    
    public int diff(Node node) {
        if (node == null) {
            return 0;
        }
        int leftChildren = count(node.left);
        int rightChildren = count(node.right);
        
        return Math.abs(leftChildren - rightChildren);
    }

    public static void main(String[] args) {
        Subtrees s = new Subtrees();
//        Node tree = new Node(null,
//                             new Node(new Node(null,null),
//                                      new Node(null,null)));
//        System.out.println(s.diff(tree)); // 3
        Node tree = new Node(new Node(new Node(new Node(new Node(null, null),null),null),null),
                new Node(new Node(new Node(new Node(new Node(null, null),null),null),null),null));
        System.out.println(s.diff(tree));
    }
}