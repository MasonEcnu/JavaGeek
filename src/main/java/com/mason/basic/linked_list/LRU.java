package com.mason.basic.linked_list;

import java.util.LinkedList;

/**
 * Created by mwu on 2020/9/1
 * 基于链表实现的LRU缓存
 * <p>
 * 1. 如果此数据之前已经被缓存在链表中了，我们遍历得到这个数据对应的结点，
 * 并将其从原来的位置删除，然后再插入到链表的头部。
 * 2. 如果此数据没有在缓存链表中，又可以分为两种情况：
 * 2.1 如果此时缓存未满，则将此结点直接插入到链表的头部；
 * 2.2 如果此时缓存已满，则链表尾结点删除，将新的数据结点插入链表的头部。
 */
public class LRU {

    private final LinkedList<Integer> list;
    private final int capacity;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
    }

    public boolean visit(int value) {
        // 如果存在，则从原来的位置删除
        boolean exist = list.removeFirstOccurrence(value);
        if (list.size() >= capacity) {
            // 缓存已满，删除尾节点
            list.removeLast();
        }
        // 将访问的值添加到头节点
        list.addFirst(value);
        return exist;
    }

    @Override
    public String toString() {
        return "LRU{" +
                "list=" + list +
                ", capacity=" + capacity +
                '}';
    }
}
