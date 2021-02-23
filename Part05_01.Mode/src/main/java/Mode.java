/**
 *
 * @author sonjaek
 */

import java.util.HashMap;


public class Mode {
    // We need an online algorithm for this.

    HashMap<Integer, Integer> hm = new HashMap<>();
    int biggestCount = 0;
    int mostCommon = 0;

    public int add(int x) {
        if (hm.containsKey(x)) {
            hm.put(x, hm.get(x) + 1);
        } else {
            hm.put(x, 1);
        }

        if (hm.get(x) > biggestCount) {
            mostCommon = x;
            biggestCount = hm.get(x);
        } else if (hm.get(x) == biggestCount && mostCommon > x) {
            mostCommon = x;
            biggestCount = hm.get(x);
        }
        
        return mostCommon;
    }

    public static void main(String[] args) {
        Mode m = new Mode();
        System.out.println(m.add(1)); // 1
        System.out.println(m.add(2)); // 1
        System.out.println(m.add(2)); // 2
        System.out.println(m.add(1)); // 1
        System.out.println(m.add(3)); // 1
        System.out.println(m.add(3)); // 1
        System.out.println(m.add(3)); // 3
    }
}