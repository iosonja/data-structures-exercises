/**  
 *
 * @author sonjaek
 */

import java.util.ArrayDeque;


public class FlipList {
    
    boolean flipped;


    ArrayDeque<Integer> ad = new ArrayDeque<>();
    
    
    public void pushLast(int x) {
        if (!flipped) {
            ad.addLast(x);
        } else {
            ad.addFirst(x);
        }
    }

    public void pushFirst(int x) {
        if (!flipped) {
            ad.addFirst(x);
        } else {
            ad.addLast(x);
        }
    }

    public int popLast() {
        if (!flipped) {
            return ad.getLast();
        } else {
            return ad.getFirst();
        }
    }

    public int popFirst() {
        if (!flipped) {
            return ad.getFirst();
        } else {
            return ad.getLast();
        }
    }

    public void flip() {
        flipped = !flipped;
    }

    public static void main(String[] args) {
        FlipList f = new FlipList();
        f.pushLast(1);
        f.pushLast(2);
        f.pushLast(3);
        System.out.println(f.popFirst()); // 1
        f.flip();
        System.out.println(f.popFirst()); // 3
    }
}
