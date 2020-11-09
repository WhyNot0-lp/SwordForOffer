package com.lp.swordForOffer.arrayAndMatrix;

/**
 * @author lp
 * @date 2020/11/5 15:55
 */
public class RepeatNum {

    /*
     * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，
     * 但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     *
     * Input:{2, 3, 1, 0, 2, 5}
     * Output:2
     *
     * */


    public static void duplicate1(int[] numbers, int length, int[] duplication) {
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplication[0] = numbers[i];
                    System.out.println(duplication[0]);
                }
            }
        }
    }

    public static boolean duplicate2(int[] numbers, int length, int[] duplication) {
        if (numbers == null || length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    System.out.println(duplication[0]);
                    return true;
                }
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }

    private static void swap(int[] numbers, int i, int j) {
        int t = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }


    public static void main(String[] args) {

        int[] numbers = {3, 3, 1, 0, 2, 5};
        int[] duplication = new int[1];
//        duplicate1(numbers, numbers.length, duplication);
        duplicate2(numbers, numbers.length, duplication);


    }


}
