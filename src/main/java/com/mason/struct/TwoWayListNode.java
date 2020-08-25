package com.mason.struct;

/**
 * Created by mwu on 2020/8/24
 * 双向链表节点
 */
public class TwoWayListNode {

    public int val;
    public TwoWayListNode pre = null;
    public TwoWayListNode next = null;

    public TwoWayListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("TwoWayListNode[val:%s, pre:%s, next:%s]", val, pre, next);
    }
}
