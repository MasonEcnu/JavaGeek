package com.mason.struct;

/**
 * Cratd by mwu on 2020/8/20
 * 单向链表节点
 */
public class SingleListNode {

    public int val;
    public SingleListNode next = null;

    public SingleListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("SingleListNode[val:%s, next:%s]", val, next);
    }
}
