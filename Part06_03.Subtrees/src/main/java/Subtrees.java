/**
 *
 * @author sonjaek
 */
public class Subtrees {
    
    public int count(Node node) {
        if (node == null)
            return 0;
        if (node.right == null)
            return count(node.left);
        return 1 + count(node.left) + count(node.right);
    }
    
    public int diff(Node node) {
        if (node == null) {
            return 0;
        }
        int left = count(node.left);
        int right = count(node.right);
        
        return Math.abs(left - right);
    }

    public static void main(String[] args) {
        Subtrees s = new Subtrees();
        Node tree = new Node(null,
                             new Node(new Node(null,null),
                                      new Node(null,null)));
        System.out.println(s.diff(tree)); // 3
    }
}