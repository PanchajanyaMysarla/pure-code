package com.code.old.arrays;

import java.util.*;
import java.util.stream.Collectors;

/*
Single Number
Solution
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
public class SingleNumber {

    public int singleNumber(int[] nums){
        int ans = 0;
        for(int i =0;i<nums.length;++i){
            ans^=nums[i];
        }


        return ans;
    }

    public int singleNumber2(int[] nums){

        List<Integer> nodups = new ArrayList<>();

        for(int num : nums){
            if(nodups.contains(num)){
                nodups.remove(Integer.valueOf(num));

            }else{
                nodups.add(num);
            }
        }

        return nodups.get(0);

    }

    public int singleNumber3(int[] nums){
        Map<Integer,Integer> counter = new HashMap<>();

        for (int num: nums){
            counter.put(num,counter.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            if(counter.get(num) == 1 ){
                return num;

            }
        }

        return 0;
    }

    public int singleNumber4(int [] nums){
        int sum = Arrays.stream(nums).sum();
        int uniqSum =  Arrays.stream(nums).boxed().collect(Collectors.toSet()).stream().reduce((a,b)->a+b).get();

        return 2* uniqSum - sum;

//        Set<Integer> uniq =  new HashSet<>();
//        for(int num:nums){
//            uniq.add(num);
//        }
//
//        int uniqSum =  uniq.stream().reduce((a,b)->a+b).get();
        //return 2* uniqSum - sum;

    }

    public static void main(String[] args) {
        int [] nums  = {2,2,1};
        int []  nums2= {4,1,2,1,2};

        System.out.println(new SingleNumber().singleNumber(nums));
        System.out.println(new SingleNumber().singleNumber2(nums));
        System.out.println(new SingleNumber().singleNumber3(nums));
        System.out.println(new SingleNumber().singleNumber4(nums2));



    }
}
