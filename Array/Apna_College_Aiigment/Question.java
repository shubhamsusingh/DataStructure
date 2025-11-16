package Array.Apna_College_Aiigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Question {
    // Question 1: Given an integer array nums, return true if any value appears at
    // least twice in the array, and return false if every element is distinct.
    public boolean checkDublicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : array) {
            if (!set.add(x)) {
                return false;
            }
        }
        return true;
    }

    // Example 1:
    // Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
    // Output: 4
    // Example 2:
    // Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
    // Output: -1
    public int findIndex(int[] array, int target) {
        // method 1:
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] == target) {
        // return i;
        // }
        // }

        // method 2:-
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        if (map.containsKey(target)) {
            return map.get(target);
        }
        return -1;
    }

    // You are given an array prices where prices[i] is the price of a given stock
    // on the i th day.Return the
    // maximum profit you can achieve from this transaction.If you cannot achieve
    // any profit,return 0.
    // Example 1:Input:prices=[7,1,5,3,6,4]Output:5

    public int price(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[j] - array[i]) > max) {
                    max = array[j] - array[i];
                }
            }
        }
        return max;
    }

    public List<ArrayList<Integer>> triplets(int[] array) {
        HashSet<ArrayList<Integer>> result = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(array[i]);
                        list.add(array[j]);
                        list.add(array[k]);
                        Collections.sort(list);
                        result.add(list);
                    }
                }
            }
        }
        // List<ArrayList<Integer>> newresult = new ArrayList<>(result);
        return new ArrayList<>(result);
    }
}
