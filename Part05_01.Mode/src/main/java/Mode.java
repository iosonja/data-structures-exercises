/**
 *
 * @author sonjaek
 */

import java.util.HashMap;


public class Mode {
    // We need an online algorithm for this.

    HashMap<Integer, Integer> hm = new HashMap<>();
    
    public int countMode() {
        int biggestValueSoFar = 0;
        int mostCommonKey = -1;
        
        for (int i: hm.keySet()) {
            if (hm.get(i) > biggestValueSoFar) {
                biggestValueSoFar = hm.get(i);
                mostCommonKey = i;
            }
        }
        return mostCommonKey;
    }

    public int add(int x) {
        int prevCount;
        int newCount;
        
        if (hm.containsKey(x)) {
            prevCount = hm.get(x);
            newCount = prevCount + 1;
            hm.put(x, newCount);
        } else {
            hm.put(x, 1);
        }
        int mode = countMode();
        
        return mode;
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