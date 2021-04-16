package com.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    /*
     Spiral Matrix
Solution
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
     */

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};

        int r = 0, c = 0, di=0;

        for (int i =0; i< R*C;i++){
            ans.add(matrix[r][c]);
            seen[r][c]= true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            if (0<=cr && cr<R && 0<=cc && cc<C && !seen[cr][cc]) {
                r = cr;
                c = cc;

            } else {
                di = (di+1)%4;
                r += dr[di];
                c += dc[di];
            }

        }


        return ans;

    }

    public static void main(String[] args) {

        int[][] matrix =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(new SpiralMatrix().spiralOrder(matrix));
    }
}
