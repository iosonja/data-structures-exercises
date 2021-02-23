/**
 *
 * @author sonjaek
 */

import java.util.HashSet;


public class Robot {
    public int count(String s) {
        HashSet<int[]> hm = new HashSet<>();
        int[] coo = {0, 0};
        hm.add(coo);
        
        int x = 0;
        int y = 0;
        for (char c: s.toCharArray()) {
            switch (c) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    break;
            }
            int[] coordinate = {x, y};
            if (!hm.contains(coordinate)) {
                hm.add(coordinate);
            }
        }
        
        return hm.size();
    }
    
    public static void main(String[] args) {
        Robot r = new Robot();
        System.out.println(r.count("LL")); // 3
        System.out.println(r.count("UUDLRR")); // 5
        System.out.println(r.count("UDUDUDU")); // 2
    }
}
