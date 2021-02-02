/**
 *
 * @author sonjaek
 */
public class Sequence {
    
    public String calculate(String x) {
        
        int c = 1;
        String previous = "";
        String midvalue = "";
        
        for (int i = x.length(); i > 0; i--) {
            
            String current = x.substring(i-1, i);
            
            if (current.equals(previous)) {
                c++;
            } else if (previous != "" && !previous.equals(current)) {
                midvalue = String.valueOf(c) + previous + midvalue;
                c = 1;
            } else if (i == 0) {
                midvalue = String.valueOf(c) + current + midvalue;
            }
            
            previous = current;
        }
        String value = String.valueOf(c) + previous + midvalue;

        return value;
    }
    
    public String generate(int n) {
        String s = "1";
        if (n == 1) {
            return "1";
        }
        for (int i = 1; i < n; i++) {
            s = calculate(s);
        }
        
        return s;
        
    }

    public static void main(String[] args) {
        Sequence s = new Sequence();
        System.out.println(s.generate(1)); // 1
        System.out.println(s.generate(2)); // 11
        System.out.println(s.generate(3)); // 21
        System.out.println(s.generate(4)); // 1211
        System.out.println(s.generate(5)); // 111221
    }
}