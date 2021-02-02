/**
 *
 * @author sonjaek
 */
public class OneChar {
    public long count(String s) {
        
        long sum = 0;
        int counter = 1;
        String previous = "";
        
        for(int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i+1);
            if (current.equals(previous)) {
                counter++;
                sum += counter;
            } else {
                counter = 1;
                sum += counter;
                previous = current;
            }
        }
        return sum;
    }
 
    public static void main(String[] args) {
        OneChar o = new OneChar();
        System.out.println(o.count("aaa")); // 6
        System.out.println(o.count("abbbcaa")); // 11
        System.out.println(o.count("abcde")); // 5
    }
}
