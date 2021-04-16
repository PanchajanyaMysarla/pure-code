package com.code.arrays;

import java.util.HashSet;
import java.util.Set;

/*
Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubArray {


    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0], currentSum = nums[0];

        for(int i =1;i<n;i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int []  nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaximumSubArray().maxSubArray(nums)+" ans");
    }
}
