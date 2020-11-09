package com.lp.swordForOffer.stackQueueHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author lp
 * @date 2020/11/7 15:45
 */
public class GetLeastNumbers {

    /*
     * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
     * 输入： [4,5,1,6,2,7,3,8],4
     * 输出： [1,2,3,4]
     *
     * */


    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        if (k > nums.length || k <= 0) {
            return new ArrayList<>();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 1, 6, 2, 7, 3, 8};

        ArrayList<Integer> integers = GetLeastNumbers_Solution(nums, 4);

        System.out.println(integers.toString());

    }
}
