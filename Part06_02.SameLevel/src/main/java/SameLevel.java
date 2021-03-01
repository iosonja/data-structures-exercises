/**
 * The program counts how many nodes there are in a given binary tree on a 
 * certain level.
 * Maximum number of nodes: 100
 * @author sonjaek
 */
public class SameLevel {
    public int count(Node node, int level) {
        if (node == null) {
            return 0;
        } else if (level - 1 != 0) {
            return count(node.left, level - 1) + count(node.right, level - 1);
        } else if (node != null) {
            // this is NOT an unnecessary test although NetBeans claims so
            return 1;
        } else if (node.left != null && node.right != null) {
            return count(node.left, 1) + count(node.right, 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        SameLevel s = new SameLevel();
        Node tree = new Node(null,
                             new Node(new Node(null,null),
                                      new Node(null,null)));
        System.out.println(s.count(tree,1)); // 1
        System.out.println(s.count(tree,2)); // 1
        System.out.println(s.count(tree,3)); // 2
        System.out.println(s.count(tree,4)); // 0
    }
}