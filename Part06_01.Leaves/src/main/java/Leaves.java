/**
 *
 * @author sonjaek
 */
public class Leaves {
    public int count(Node node) {
        // TODO
    }

    public static void main(String[] args) {
        Leaves l = new Leaves();
        Node tree = new Node(null,
                             new Node(new Node(null,null),
                                      new Node(null,null)));
        System.out.println(l.count(tree)); // 2
    }
}