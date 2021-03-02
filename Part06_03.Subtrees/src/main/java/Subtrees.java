/**
 * @author sonjaek
 * 
 * The program counts the biggest difference that occurs between the number of 
 * child nodes on the right and left side of all the nodes in a given binary 
 * tree.
 */
public class Subtrees {
    
    public int[] count(Node node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] left = count(node.left);
        int[] right = count(node.right);
        
        int counter = left[0] + right[0] + 1;
        int difference = Math.abs(left[0] - right[0]);
        
        return new int[] {counter, 
                          Math.max(difference, Math.max(left[1], right[1]))};
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
    }
}