/**
 *
 * @author sonjaek
 */
public class Balance {
    public long count(String s) {
        // TODO
    }

    public static void main(String[] args) {
        Balance b = new Balance();
        System.out.println(b.count("CCAABB")); // 1
        System.out.println(b.count("CBACBA")); // 5
        System.out.println(b.count("AAABBC")); // 0
    }
}
