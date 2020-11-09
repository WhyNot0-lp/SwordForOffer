package com.lp.swordForOffer.arrayAndMatrix;

/**
 * @author lp
 * @date 2020/11/5 16:28
 */
public class TwoArrayFind {

    /*
     * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
     *
     * Consider the following matrix:
     *    [
     *      [1,   4,  7, 11, 15],
     *      [2,   5,  8, 12, 19],
     *      [3,   6,  9, 16, 22],
     *      [10, 13, 14, 17, 24],
     *      [18, 21, 23, 26, 30]
     *    ]
     *
     *  Given target = 5, return true.
     *  Given target = 20, return false.
     *
     * */

    public static boolean Find(int target, int[][] array) {

        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }

        int rows = array.length;
        int cols = array[0].length;
        int r = 0;
        // 从右上角开始查找
        int c = cols - 1;

        while (r <= rows - 1 && c >= 0) {
            if (target == array[r][c]) {
                return true;
            } else if (target > array[r][c]) {
                r++;
            } else {
                c--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};


        System.out.println(Find(16, array) ? "true" : "false");
    }

}
