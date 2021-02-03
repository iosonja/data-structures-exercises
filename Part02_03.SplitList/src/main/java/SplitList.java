/**
 *
 * @author sonjaek
 */
public class SplitList {
    
    public int count(int[] t) {
        int sum = 0;
        int size = t.length;
        
        int[] leftSide = new int[size];
        int[] rightSide = new int[size];
        
        leftSide[0] = t[0];
        rightSide[size - 1] = t[size];
        
        for (int i = 1; i < size; i++) {
            if (leftSide[i - 1] > t[i]) {
                leftSide[i] = leftSide[i - 1];
            } else {
                leftSide[i] = t[i];
            }
        }
        
        for (int i = size - 2; i >= 0; i--) {
            if (rightSide[i + 1] < t[i]) {
                rightSide[i] = rightSide[i + 1];
            } else {
                rightSide[i] = t[i];
            }
        }
        
        for (int i = 0; i < size - 1; i++) {
            if (leftSide[i] < rightSide[i + 1]) {
                if (leftSide[i] < leftSide[i + 1]) {
                    if (rightSide[i] < rightSide[i + 1]) {
                        sum++;
                    }
                }
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        SplitList s = new SplitList();
        System.out.println(s.count(new int[] {1,2,3,4,5})); // 4
        System.out.println(s.count(new int[] {5,4,3,2,1})); // 0
        System.out.println(s.count(new int[] {2,1,2,5,7,6,9})); // 3
    }
}