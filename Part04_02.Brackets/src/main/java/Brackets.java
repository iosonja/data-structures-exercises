/**
 * 
 * @author sonjaek
 */
public class Brackets {
    public int count(String s) {
        int oddBrackets = s.length();
        int openBrackets = 0;
        
        for (char c: s.toCharArray()) {
            switch (c) {
                case '(':
                    openBrackets++;
                    break;
                case ')':
                    if (openBrackets > 0) {
                        openBrackets--;
                        oddBrackets -= 2;
                    } else { // Removing this block causes problems for some reason
                        continue;
                    }   break;
                default:
                    System.out.println("There was an invalid character.");
                    return 0;
            }
        }
        return oddBrackets;
    }

    public static void main(String[] args) {
        Brackets b = new Brackets();
        System.out.println(b.count("(()())")); // 0
        System.out.println(b.count("))))))")); // 6
        System.out.println(b.count("((())(")); // 2
    }
}