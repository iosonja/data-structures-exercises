/**
 *
 * @author sonjaek
 */

import java.util.ArrayList;


public class Lisp {
    public long eval(String s) {
        
        String ss = s.replace("(", " ( ");
        ss = ss.replace(")", " ) ");
        String[] array = ss.split(" ");
        
        
        ArrayList<String> valuesBetweenBrackets = new ArrayList<>();
        ArrayList<Integer> integerArray = new ArrayList<>();
        
        for (String c: array) {
            c = c.trim();
            if (c.equals("(")) {
                continue;
            } else if (c.equals(")")) {
                int i = valuesBetweenBrackets.size() - 1;
                while (i >= 0) {
                    if (valuesBetweenBrackets.get(i).equals("*")) {
                        valuesBetweenBrackets.remove(i);
                        int result = 1;
                        for (int x: integerArray) {
                            result *= x;
                        }
                        valuesBetweenBrackets.add(String.valueOf(result));
                        integerArray.clear();
                        break;
                    } else if (valuesBetweenBrackets.get(i).equals("+")) {
                        valuesBetweenBrackets.remove(i);
                        int result = 0;
                        for (int x: integerArray) {
                            result += x;
                        }
                        valuesBetweenBrackets.add(String.valueOf(result));
                        integerArray.clear();
                        break;
                    } else {
                        String val = valuesBetweenBrackets.get(valuesBetweenBrackets.size() - 1);
                        valuesBetweenBrackets.remove(i);
                        integerArray.add(Integer.valueOf(val));
                    }
                    i--;
                }
            } else if (!c.equals("")) { // This has to be here and I dunno why
                valuesBetweenBrackets.add(c);
            }
        }
        return Integer.valueOf(valuesBetweenBrackets.get(0));
    }

    public static void main(String[] args) {
        Lisp l = new Lisp();
        System.out.println(l.eval("(+ 1 2 3 4 5)")); // 15
        System.out.println(l.eval("(+ 5 (* 3 2) 7)")); // 18
        System.out.println(l.eval("(* (+ (+ 1 2) 3) (+ (* 4 5) 6 2))")); // 168
    }
}
