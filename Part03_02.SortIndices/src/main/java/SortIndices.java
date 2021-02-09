/**
 *
 * @author sonjaek
 */
import java.util.*;

public class SortIndices {
    public int[] get(int[] t) {
        int[] indices = new int[t.length];
        int[] sortedArray = Arrays.copyOf(t, t.length);
        Arrays.sort(sortedArray);
        
        int currentIndex;
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[j] == sortedArray[i]) {
                    indices[i] = j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        SortIndices s = new SortIndices();
        System.out.println(Arrays.toString(s.get(new int[] {1,2,4,3}))); // [0,1,3,2]
        System.out.println(Arrays.toString(s.get(new int[] {4,2,1,3}))); // [2,1,3,0]
        System.out.println(Arrays.toString(s.get(new int[] {6,2,8,5,3}))); // [1,4,3,0,2]
    }
}