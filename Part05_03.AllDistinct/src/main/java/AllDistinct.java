
import java.util.HashMap;

/**
 *
 * @author sonjaek
 */
public class AllDistinct {
    public long count(int[] t) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long sum = 0;
        int x = -1;
        
        for (int i = 0; i < t.length; i++) {
            if (!hm.containsKey(t[i])) {
                sum += i - x;
                hm.put(t[i], i);
            } else {
                if (hm.get(t[i]) > x) { 
                    x = hm.get(t[i]);
                }
                sum += i - x;
                hm.put(t[i], i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        AllDistinct a = new AllDistinct();
        System.out.println(a.count(new int[] {1,2,3,4,5})); // 15
        System.out.println(a.count(new int[] {1,1,1,1,1})); // 5
        System.out.println(a.count(new int[] {1,2,1,1,2})); // 8
    }
}