
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonjaek
 */
public class Lucky {
    public boolean check(int n) {
        String number = String.valueOf(n);
        ArrayList<Character> arlist = new ArrayList<Character>();
        
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            arlist.add(c);
        } 
        
        ArrayList<Integer> listOfDigits = new ArrayList<Integer>();
                
        for (char digit: arlist) {
            listOfDigits.add(Character.getNumericValue(digit));
        }
        
        int sum = 0;
        
        for (Integer d: listOfDigits) {
            sum += d;
        }
        System.out.println(sum);
        return sum % 7 == 0;
    }

    public static void main(String[] args) {
        Lucky l = new Lucky();
        System.out.println(l.check(14)); // false
        System.out.println(l.check(16)); // true
        System.out.println(l.check(123)); // false
        System.out.println(l.check(777)); // true
        System.out.println(l.check(9999999)); // true
    }
}