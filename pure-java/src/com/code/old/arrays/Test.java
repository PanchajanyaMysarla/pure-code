package com.code.old.arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = {1, 7, 3, 6, 5, 6};
//
//        List<Integer> numsList =  new ArrayList<>();
//
//        for(int n:nums) numsList.add(n);
//        System.out.println(numsList);
//        System.out.println(numsList.stream().sorted((a,b)-> a-b).collect(Collectors.toList()));
//        System.out.println(Arrays.stream(nums).sum());
//        System.out.println(ArraysAndStrings.pivotIndex(nums));
//
//        int ans = ArraysAndStrings.pivotIndex(numsList);



        int[] nums = {3, 6, 1, 0};
        int ans = LargestNumAtleastTwice.dominantIndex(nums);
        System.out.println(ans);


    }
}
