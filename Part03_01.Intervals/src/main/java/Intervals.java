/**
 *
 * @author sonjaek
 */
import java.util.ArrayList;
import java.util.Arrays;


public class Intervals {
    public int count(int[] t) {
        
        if (t.length == 1) {
            return 1;
        }
        Arrays.sort(t);
        
        int firstItem = t[0];
        int previousItem = t[0];
        ArrayList<int[]> intervals = new ArrayList<>();
        
        for (int i = 1; i < t.length; i++) {
            if (t[i] == previousItem + 1) {
                previousItem = t[i];
                
                if (i + 1 == t.length) {
                    // Redundant duplicate code:
                    int[] newInterval = new int[2];
                    newInterval[0] = firstItem;
                    newInterval[1] = previousItem;
                    intervals.add(newInterval);
                }
            } else {
                // The following 4 lines could probably be done more easily...
                int[] newInterval = new int[2];
                newInterval[0] = firstItem;
                newInterval[1] = previousItem;
                intervals.add(newInterval);
                
                firstItem = previousItem = t[i];
                                
                if (i + 1 == t.length) {
                    // Redundant duplicate code:
                    int[] newerInterval = new int[2];
                    newerInterval[0] = firstItem;
                    newerInterval[1] = previousItem;
                    intervals.add(newerInterval);
                }
            }
        }

        return intervals.size();
    }

    public static void main(String[] args) {
        Intervals i = new Intervals();
        System.out.println(i.count(new int[] {4,1,5,3})); // 2
        System.out.println(i.count(new int[] {4,2,1,3})); // 1
        System.out.println(i.count(new int[] {5,2,7,6,3,9})); // 3
    }
}