package com.Java.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySuffle {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before Shuffling ");
        System.out.print("[");
        for(int i=0;i<array.length;i++)
        	System.out.print(array[i]+" ");
        System.out.print("]");
        System.out.println();
        // Convert array to list and shuffle it
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        // Convert the list back to array
        list.toArray(array);

        // Print the shuffled array
        System.out.println("After Shuffling ");
        System.out.println(Arrays.toString(array));
    }
}

