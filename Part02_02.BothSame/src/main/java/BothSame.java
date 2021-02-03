/**
 *
 * @author sonjaek
 */
import java.util.HashMap;


public class BothSame {
    
    public long count(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            String currentChar = Character.toString(s.charAt(i));
            
            if (map.containsKey(currentChar)) {
                int oldValue = map.get(currentChar);
                int newValue = oldValue + 1;
                map.replace(currentChar, newValue);
            } else {
                map.put(currentChar, 1);
            }
        }

        long result = 0;
        for (long currentValue: map.values()) {
            result += currentValue * (currentValue + 1) / 2;
        }
        
        return result;
    }

    public static void main(String[] args) {
        BothSame b = new BothSame();
        System.out.println(b.count("aaa")); // 6
        System.out.println(b.count("abcd")); // 4
        System.out.println(b.count("ababca")); // 10
    }
}
