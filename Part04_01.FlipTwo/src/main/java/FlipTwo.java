
import java.util.ArrayDeque;

/**
 *
 * @author sonjaek
 */
public class FlipTwo {
    
    public ArrayDeque<Integer> makeDeque(int n) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }
        return deque;
    }
    
    public int solve(int n, int k) {
        ArrayDeque<Integer> deque = makeDeque(n);
        for (int i = 1; i <= k; i++) {
            int first = deque.getFirst();
            deque.removeFirst();
            int second = deque.getFirst();
            deque.removeFirst();
            
            deque.addLast(second);
            deque.addLast(first);
        }
        return deque.getFirst();
    }
    
    public static void main(String[] args) {
        FlipTwo f = new FlipTwo();
        System.out.println(f.solve(4,3)); // 4
        System.out.println(f.solve(12,5)); // 11
        System.out.println(f.solve(99,555)); // 11
    }
}