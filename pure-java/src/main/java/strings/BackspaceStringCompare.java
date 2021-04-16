package com.code.strings;

import java.util.Stack;

/*
Backspace String Compare
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return  build(S).equals(build(T));

        }

    private String build(String a){
        Stack<Character> ans = new Stack<>();
        for(char c:a.toCharArray()){
            if(c !='#'){
                ans.push(c);
            }
            else if(!ans.empty()) ans.pop();
        }
        System.out.println(ans+"::::"+String.valueOf(ans));
        return String.valueOf(ans);

    }

    public  boolean backspaceCompareTwoPointer(String S,String T){

        int i = S.length() -1,j = T.length() -1;
        int skipS =0,skipT =0;

        while (i >=0 || j >=0){
            while(i >=0){
                if(S.charAt(i) == '#') {skipS++; i--;}
                else if(skipS > 0) {skipS --; i--;}
                else break;
            }
            while(j >=0){
                if(T.charAt(j)== '#') {skipT++; j--;}
                else if(skipT > 0 ) {skipT--; j--;}
                else break;
            }

            if(i >= 0 && j >=0 && S.charAt(i) != T.charAt(j)){
                return false;
            }

            if(i >=0 != j>=0 ){
                return false;
            }
            i--; j--;


        }

        return true;

    }

    public static void main(String[] args) {
        String S = "ab#c", T = "ad#c";
       boolean ans = new BackspaceStringCompare().backspaceCompareTwoPointer(S,T);
        System.out.println(ans);
    }
}
