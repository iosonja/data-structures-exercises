/**
 *
 * @author sonjaek
 */

import java.util.ArrayList;
import java.util.HashMap;


public class Balance {
    public long count(String s) {
        int[] tester = {0, 0, 0};
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(0);
        
        HashMap<ArrayList<Integer>, Integer> subsequences = new HashMap<>();
        subsequences.put(al, 1);
        long sum = 0;
        
        for (char c: s.toCharArray()) {
            tester[c-65] += 1; // 65 is where the alphabets start in ASCII code
            ArrayList<Integer> al2 = new ArrayList<>();
            al2.add(tester[0] - tester[1]);
            al2.add(tester[0] - tester[2]);
            
            if (subsequences.containsKey(al2)) {
                sum += subsequences.get(al2);
                subsequences.put(al2, subsequences.get(al2) + 1);
            } else {
                subsequences.put(al2, 1);
            }
            
        }
        return sum;
    }

    public static void main(String[] args) {
        Balance b = new Balance();
        System.out.println(b.count("CCAABB")); // 1
        System.out.println(b.count("CBACBA")); // 5
        System.out.println(b.count("AAABBC")); // 0
    }
}
