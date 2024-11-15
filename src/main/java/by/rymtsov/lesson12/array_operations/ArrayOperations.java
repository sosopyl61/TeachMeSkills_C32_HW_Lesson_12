package main.java.by.rymtsov.lesson12.array_operations;

import java.util.HashMap;

/**
 * This class contains methods to:
 * 1). Generate random array.
 * 2). Rotate given array to the right on k steps.
 * 3). Get number of minimal steps to transform a string using dictionary.
 * 4). Solve two sum problem.
 */

public class ArrayOperations {

    public static int[] randomArray(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int) ((Math.random() * 10) + 1);
        }
        return arr;
    }

    public static int[] rotateArrayToRight(int[] array, int k) {
        if (k >= array.length) {
            System.out.println("Your rotation degree is more equals the array length.");
            return array;
        }
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[(i + k) % array.length] = array[i];
        }
        return newArray;
    }

    /*public static int findMinimalStepsToTransformString(String start, String end, String[] dict) {
        
    }*/

    public static void twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            int value = target - array[i];
            if (map.containsKey(value)) {
                System.out.println("First index: " + map.get(value) + "\n" + "Second index: " + i);
                System.out.println("-----------------");
            }
            map.put(array[i], i);
        }
    }
}
