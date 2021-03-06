package com.code.old.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/*
Plus One
Solution
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

       // List<Integer> list = new ArrayList<>();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int carry = 1;

        for (int i = digits.length -1 ;i >=0;i--){
            int total = digits[i] + carry;
            carry = total/10;
            deque.offerFirst(total%10);

        }
        if (carry != 0){
            deque.offerFirst(carry);
        }

        System.out.println(deque);



        return digits;

    }

    public static void main(String[] args) {
       int[] digits = {1,2,3};
      new PlusOne().plusOne(digits);
    }

}
