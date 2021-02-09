/**
 *
 * @author sonjaek
 */

import java.util.Arrays;


public class Boxes {
    public int count(int[] t, int x) {
        // sort
        // ota isoin arvo
        // etsi isoin joka vielä mahtuu
        // vähennä edelliset listalta
        // count += 1
        // looppaa kunnes tavarat loppuu
        
        int boxes = 0;
        Arrays.sort(t);
        
        int temp = 0;
        
        for (int i = t.length - 1; i >= 0; i--) {
            if (temp < i && t[i] + t[temp] <= x) {
                temp += 1;
            } else {
                boxes += 1;
            }
        }
        
        return boxes;
        
//        while (true) {
//            
//            int availableSpace = x;
//            availableSpace -= t[t.length - 1];
//            for 
//        }
    }

    public static void main(String[] args) {
        Boxes b = new Boxes();
        System.out.println(b.count(new int[] {1,2,3,4}, 10)); // 2
        System.out.println(b.count(new int[] {4,4,4,4}, 4)); // 4
        System.out.println(b.count(new int[] {7,2,3,9}, 10)); // 3
        System.out.println(b.count(new int[] {4,2,1,5,3}, 6)); // 3
    }
}