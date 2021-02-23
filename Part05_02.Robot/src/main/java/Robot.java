/**
 *
 * @author sonjaek
 */
 
import java.util.HashMap;
 
 
public class Robot {
    public int count(String s) {
        HashMap<int[], String> hm = new HashMap<>();
        int[] coo = {0, 0};
        hm.put(coo, "check");
        
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
            int[] coordinate = new int[2];
            coordinate[0] = x;
            coordinate[1] = y;
            hm.put(coordinate, "check");
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
