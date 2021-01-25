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
    
    private int[] array;
    private int arraySize = 0;
    
    public Zigzag() {
        array = new int[0];
    }
    
    public int[] create(int n) {
        arraySize += 1;
        int[] newArray = new int[arraySize];
        
        if (n % 2 == 0 || n == 1) {
            for (int i = 0; i < arraySize - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[arraySize - 1] = n;
        } else {
            newArray[0] = n;
            for (int i = 1; i < arraySize; i++) {
                newArray[i] = array[i - 1];
            }
        }
        array = newArray;
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

