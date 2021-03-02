/**
 * This program counts how many times mainTree is included in another binary 
 * tree as a subtree.
 * @author sonjaek
 */
public class FindTree {
    public boolean isSame(Node mainTreeNode, Node comparableTreeNode) {
        if (mainTreeNode == null && comparableTreeNode == null) {
            return true;
        } else if ((mainTreeNode != null) && (comparableTreeNode != null)) {
            return isSame(mainTreeNode.left, comparableTreeNode.left) && 
                   isSame(mainTreeNode.right, comparableTreeNode.right);
        }
        return false;
    }
    
    public int count(Node mainTree, Node treeThatContainsMainTrees) {
        if (treeThatContainsMainTrees == null) {
            return 0;
        }
        int oneOrZero;
        if (isSame(mainTree, treeThatContainsMainTrees)) {
            oneOrZero = 1;
        } else {
            oneOrZero = 0;
        }
        int occurrences = oneOrZero
                        + count(mainTree, treeThatContainsMainTrees.left)
                        + count(mainTree, treeThatContainsMainTrees.right);
        return occurrences;
    }

    public static void main(String[] args) {
        FindTree f = new FindTree();
        Node tree1 = new Node(new Node(null,null),
                              new Node(null,null));
        Node tree2 = new Node(null,
                              new Node(new Node(null,null),
                                       new Node(null,null)));
        System.out.println(f.count(tree1,tree2)); // 1
    }
}