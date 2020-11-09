package com.lp.swordForOffer.stackQueueHeap;

import java.util.Stack;

/**
 * @author lp
 * @date 2020/11/7 10:22
 */
public class StackToQueue {

    /*
     * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
     *
     * */


    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void push(int node) {
        in.push(node);

    }

    public int pop() throws Exception {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        if (out.isEmpty()) {
            throw new Exception("queue is empty");
        }
        return out.pop();
    }


}
