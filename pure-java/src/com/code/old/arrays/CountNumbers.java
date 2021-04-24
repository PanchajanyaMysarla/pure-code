package com.code.old.arrays;

import java.util.*;
import java.util.stream.Collectors;

/*

Counting Elements
Given an integer array arr, count element x such that x + 1 is also in arr.

If there're duplicates in arr, count them seperately.



Example 1:

Input: arr = [1,2,3]
Output: 2
Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
Example 2:

Input: arr = [1,1,3,3,5,5,7,7]
Output: 0
Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
Example 3:

Input: arr = [1,3,2,3,5,0]
Output: 3
Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
Example 4:

Input: arr = [1,1,2,2]
Output: 2
Explanation: Two 1s are counted cause 2 is in arr.
 */
public class CountNumbers {

    public int countElements(int[] arr) {
        int ans = 0;
        Map<Integer,Integer> counter = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            counter.put(arr[i],counter.getOrDefault(arr[i],0)+1);
        }
        System.out.println(counter);


        for(int i=0;i<arr.length;i++){
            int el = arr[i]+1;
            if(counter.containsKey(el)){
                ans++;
                counter.replace(el,counter.get(el)-1);
            }
        }
        System.out.println(counter+""+ans);

    return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {1,1,3,3,5,5,7,7};
        int [] arr3 = {1,3,2,3,5,0};
        int [] arr4 = {1,1,2,2};
        int [] arr5 = {1,1,2};

        System.out.println(new CountNumbers().countElements(arr4));

    }
}
