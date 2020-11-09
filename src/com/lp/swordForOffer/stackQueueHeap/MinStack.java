package com.lp.swordForOffer.stackQueueHeap;

import java.util.Stack;

/**
 * @author lp
 * @date 2020/11/7 10:37
 */
public class MinStack {

    /*
     *  实现一个包含 min() 函数的栈，该方法返回当前栈中最小的值。
     *
     * */

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(node, minStack.peek()));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();

    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }


}
