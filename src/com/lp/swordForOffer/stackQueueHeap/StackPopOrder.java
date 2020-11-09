package com.lp.swordForOffer.stackQueueHeap;

import java.util.Stack;

/**
 * @author lp
 * @date 2020/11/7 10:58
 */
public class StackPopOrder {

    /*
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
     *
     * 例如序列 1,2,3,4,5 是某栈的压入顺序，序列 4,5,3,2,1 是该压栈序列对应的一个弹出序列，但 4,3,5,1,2 就不可能是该压栈序列的弹出序列。
     *
     * */


    public static boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            while (popIndex < n && !stack.isEmpty()
                    && stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        int[] pushSequence = {1, 2, 3, 4, 5};
        int[] popSequence = {4, 5, 3, 2, 1};

        boolean flag = IsPopOrder(pushSequence, popSequence);

        System.out.println(flag?"true":"false");

    }

}
