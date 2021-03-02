/**
 * The program counts the biggest difference that occurs between the number of 
 * child nodes on the right and left side of all the nodes in a given binary 
 * tree.
 * @author sonjaek
 */
public class Subtrees {
    
    public int[] count(Node node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] leftChildren = count(node.left);
        int[] rightChildren = count(node.right);
        
        int counter = leftChildren[0] + rightChildren[0] + 1;
        int difference = Math.abs(leftChildren[0] - rightChildren[0]);
        
        int biggerNumber = Math.max(leftChildren[1], rightChildren[1]);
        
        return new int[] {counter, Math.max(difference, biggerNumber)};
    }
    
    public int diff(Node node) {
        return count(node)[1];   
    }

    public static void main(String[] args) {
        Subtrees s = new Subtrees();
        Node tree = new Node(null,
                             new Node(new Node(null,null),
                                      new Node(null,null)));
        System.out.println(s.diff(tree)); // Should be 3
        
        Node tree2 = new Node(new Node(new Node(new Node(new Node(null, null),null),null),null),
                             new Node(new Node(new Node(new Node(new Node(null, null),null),null),null),null));
        System.out.println(s.diff(tree2)); // Should be 1
    }
}