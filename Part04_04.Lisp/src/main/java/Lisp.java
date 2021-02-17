/**
 *
 * @author sonjaek
 */

import java.util.ArrayList;


public class Lisp {
    public long eval(String s) {
        
        ArrayList<ArrayList<Character>> sectionList = new ArrayList<>();
        ArrayList<Character> currentCharList = null;
        int sectionListIndex = -1;
        int openBrackets = 0;
        
        for (char c: s.toCharArray()) {
            if (c == '(') {
                sectionList.add(currentCharList);
                sectionListIndex++;
                ArrayList<Character> chars = new ArrayList<>();
                currentCharList = chars;
                openBrackets++;
            } else if (c == ')') {
                sectionListIndex--;
                currentCharList = sectionList.get(sectionListIndex);
                openBrackets--;
            } else if (c == ' ') {
                continue;
            } else {
                currentCharList.add(c);
            }
        }
    }

    public static void main(String[] args) {
        Lisp l = new Lisp();
        System.out.println(l.eval("(+ 1 2 3 4 5)")); // 15
        System.out.println(l.eval("(+ 5 (* 3 2) 7)")); // 18
        System.out.println(l.eval("(* (+ (+ 1 2) 3) (+ (* 4 5) 6 2))")); // 168
    }
}
