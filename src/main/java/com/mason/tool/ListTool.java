package com.mason.tool;

import com.mason.struct.SingleListNode;
import com.mason.struct.TwoWayListNode;

import java.util.Random;

/**
 * Created by mwu on 2020/8/24
 * 链表构建工具
 */
public class ListTool {

    private static final Random random = new Random();

    /**
     * 单向链表
     *
     * @param n     节点数
     * @param bound 随机上限
     * @return 头节点
     */
    public static SingleListNode buildSingleList(int n, int bound) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is zero");
        }

        SingleListNode head = new SingleListNode(random.nextInt(bound) + 1);
        SingleListNode cur = head;
        for (int i = 1; i < n; i++) {
            cur.next = new SingleListNode(random.nextInt(bound) + 1);
            cur = cur.next;
        }
        return head;
    }

    /**
     * 单向链表
     *
     * @param arr 数据源数组
     * @return 头节点
     */
    public static SingleListNode buildSingleList(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        SingleListNode head = new SingleListNode(arr[0]);
        SingleListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new SingleListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    /**
     * 单向循环链表
     *
     * @param n     节点数
     * @param bound 随机上限
     * @return 头节点
     */
    public static SingleListNode buildSingleCycleList(int n, int bound) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is zero");
        }

        SingleListNode head = new SingleListNode(random.nextInt(bound) + 1);
        SingleListNode cur = head;
        for (int i = 1; i < n; i++) {
            cur.next = new SingleListNode(random.nextInt(bound) + 1);
            cur = cur.next;
        }
        // 遍历结束时，curr指向尾节点
        cur.next = head;
        return head;
    }

    /**
     * 单向循环链表
     *
     * @param arr 数据源数组
     * @return 头节点
     */
    public static SingleListNode buildSingleCycleList(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        SingleListNode head = new SingleListNode(arr[0]);
        SingleListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new SingleListNode(arr[i]);
            cur = cur.next;
        }
        // 遍历结束时，curr指向尾节点
        cur.next = head;
        return head;
    }

    /**
     * 双向链表
     *
     * @param n     节点数
     * @param bound 随机上限
     * @return 头节点
     */
    public static TwoWayListNode buildTwoWayList(int n, int bound) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is zero");
        }

        TwoWayListNode head = new TwoWayListNode(random.nextInt(bound) + 1);
        TwoWayListNode cur = head;
        for (int i = 1; i < n; i++) {
            TwoWayListNode newNode = new TwoWayListNode(random.nextInt(bound) + 1);
            cur.next = newNode;
            newNode.pre = cur;
            cur = cur.next;
        }
        return head;
    }

    /**
     * 双向链表
     *
     * @param arr 数据源数组
     * @return 头节点
     */
    public static TwoWayListNode buildTwoWayList(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        TwoWayListNode head = new TwoWayListNode(arr[0]);
        TwoWayListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            TwoWayListNode newNode = new TwoWayListNode(arr[i]);
            cur.next = newNode;
            newNode.pre = cur;
            cur = cur.next;
        }
        return head;
    }

    /**
     * 双向循环链表
     *
     * @param n     节点数
     * @param bound 随机上限
     * @return 头节点
     */
    public static TwoWayListNode buildTwoWayCycleList(int n, int bound) {
        if (n <= 0) {
            throw new IllegalArgumentException("n is zero");
        }

        TwoWayListNode head = new TwoWayListNode(random.nextInt(bound) + 1);
        TwoWayListNode cur = head;
        for (int i = 1; i < n; i++) {
            TwoWayListNode newNode = new TwoWayListNode(random.nextInt(bound) + 1);
            cur.next = newNode;
            newNode.pre = cur;
            cur = cur.next;
        }
        // 遍历结束时，curr指向尾节点
        cur.next = head;
        head.pre = cur;
        return head;
    }

    /**
     * 双向循环链表
     *
     * @param arr 数据源数组
     * @return 头节点
     */
    public static TwoWayListNode buildTwoWayCycleList(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        TwoWayListNode head = new TwoWayListNode(arr[0]);
        TwoWayListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            TwoWayListNode newNode = new TwoWayListNode(arr[i]);
            cur.next = newNode;
            newNode.pre = cur;
            cur = cur.next;
        }
        // 遍历结束时，curr指向尾节点
        cur.next = head;
        head.pre = cur;
        return head;
    }

    /**
     * 单链表翻转
     *
     * @param head 头节点
     * @return 翻转后的头节点
     */
    public static SingleListNode reverseList(SingleListNode head) {
        SingleListNode pre = null;
        SingleListNode curr = head;
        while (curr != null) {
            SingleListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
