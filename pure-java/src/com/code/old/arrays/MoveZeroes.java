package com.code.old.arrays;

import java.util.Arrays;

/*
Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int slow = 0;

        for (int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[slow];
                nums[slow] = nums[i] ;
                nums[i] = temp;
                slow++;
            }
        }


    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};

        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
