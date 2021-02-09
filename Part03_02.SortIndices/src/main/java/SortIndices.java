/**
 *
 * @author sonjaek
 */
import java.util.*;
import java.util.stream.IntStream;

public class SortIndices {

    public int[] get(int[] t) {
        int[] indices = new int[t.length];
        int[] sortedArray = Arrays.copyOf(t, t.length);
        Arrays.sort(sortedArray);
        
        for (int i = 0; i < t.length; i++) {
            final int currentValue = sortedArray[i];
            indices[i] = IntStream.range(0, t.length)
                        .filter(j -> t[j] == currentValue)
                        .findFirst()
                        .getAsInt();
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