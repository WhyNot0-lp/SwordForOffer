package com.lp.swordForOffer.arrayAndMatrix;

import java.util.ArrayList;

/**
 * @author lp
 * @date 2020/11/6 10:40
 */
public class ClockwiseMatrix {

    /*
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
     * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     * 则依次打印出数字 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     *
     *  1, 2, 3, 4
     *  5, 6, 7, 8
     *  9, 10,11,12
     *  13,14,15,16
     *
     * 输入： [[1,2],[3,4]]
     * 输出： [1,2,4,3]
     * */


    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        ArrayList<Integer> ret = new ArrayList<>();
        int r1 = 0;
        int r2 = matrix.length - 1;
        int c1 = 0;
        int c2 = matrix[0].length - 1;

        while (r1 <= r2 && c1 <= c2) {
            //上
            for (int i = r1; i <= c2; i++) {
                ret.add(matrix[r1][i]);
            }
            //右
            for (int i = r1 + 1; i <= r2; i++) {
                ret.add(matrix[i][c2]);
            }

            // 右
            for (int i = r1 + 1; i <= r2; i++) {
                ret.add(matrix[i][c2]);
            }
            if (r1 != r2) {
                //下
                for (int i = c2 - 1; i >= c1; i--) {
                    ret.add(matrix[r2][i]);
                }
            }
            if (c1 != c2) {
                //左
                for (int i = r2 - 1; i > r1; i--) {
                    ret.add(matrix[i][r1]);
                }
            }

            r1++;
            r2--;
            c1++;
            c2--;

        }

        return ret;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
        int[][] matrix = {{1},{2},{3},{4}};
        ArrayList<Integer> res = printMatrix(matrix);
        System.out.println(res.toString());

    }

}
