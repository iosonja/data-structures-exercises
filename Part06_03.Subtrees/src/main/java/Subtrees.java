/**
 *
 * @author sonjaek
 */
public class Subtrees {
    public int diff(Node node) {
        // TODO
    }

    public static void main(String[] args) {
        Subtrees s = new Subtrees();
        Node tree = new Node(null,
                             new Node(new Node(null,null),
                                      new Node(null,null)));
        System.out.println(s.diff(tree)); // 3
    }
}