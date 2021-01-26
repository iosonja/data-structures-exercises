/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonjaek
 */
public class Sequence {
    
    public String generate(int n) {
        // TODO
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