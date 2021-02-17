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
        
        
        ArrayList<String> values = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        
        for (String c: array) {
            c = c.trim();
            if (c.equals("(")) {
                continue;
            } else if (c.equals(")")) {
                int i = values.size() - 1;
                while (i >= 0) {
                    if (values.get(i).equals("*")) {
                        values.remove(values.size() - 1); // The parameter can maybe be replaced with i
                        int res = 1;
                        for (int x: count) {
                            res *= x;
                        }
                        values.add(String.valueOf(res));
                        count.clear();
                        break;
                    } else if (values.get(i).equals("+")) {
                        values.remove(values.size() - 1); // The parameter can maybe be replaced with i
                        int res = 1;
                        for (int x: count) {
                            res += x;
                        }
                        values.add(String.valueOf(res));
                        count.clear();
                        break;
                    } else {
                        String val = values.get(values.size() - 1);
                        values.remove(values.size() - 1); // The parameter can maybe be replaced with i
                        count.add(Integer.valueOf(val));
                    }
                    i--;
                }
            } else if (c.equals("")) {
                continue;
            } else {
                values.add(c);
            }
        }
        return Integer.valueOf(values.get(0));
    }

    public static void main(String[] args) {
        Lisp l = new Lisp();
        System.out.println(l.eval("(+ 1 2 3 4 5)")); // 15
        System.out.println(l.eval("(+ 5 (* 3 2) 7)")); // 18
        System.out.println(l.eval("(* (+ (+ 1 2) 3) (+ (* 4 5) 6 2))")); // 168
    }
}
