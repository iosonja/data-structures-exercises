/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonjaek
 */
import java.util.*;

public class Zigzag {
    
    
    public int[] create(int n) {
        int[] array = new int[n];
        int currentNumber = 1;
        for (int i = 0; i < n; i++) {
            if (currentNumber == 1 || currentNumber % 2 == 0) {
                array[i] = currentNumber;
            } else {
                int[] temp = new int[n];
                temp[0] = currentNumber;
                for (int c = 1; c < n; c++) {
                    temp[c] = array[c - 1];
                }
                array = temp;
            }
            currentNumber++;
        }

        return array;
    }

    public static void main(String[] args) {
        Zigzag z = new Zigzag();
        System.out.println(Arrays.toString(z.create(1))); // [1]
        System.out.println(Arrays.toString(z.create(2))); // [1,2]
        System.out.println(Arrays.toString(z.create(3))); // [3,1,2]
        System.out.println(Arrays.toString(z.create(4))); // [3,1,2,4]
        System.out.println(Arrays.toString(z.create(5))); // [5,3,1,2,4]
    }
}

