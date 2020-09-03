package com.mason.basic.linked_list;

import com.mason.struct.SingleListNode;

/**
 * Created by mwu on 2020/9/1
 */
public class PalindromeList {

    public static boolean isPalindrome(SingleListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;

        // 找到中间节点
        SingleListNode middle = middle(head);

        // 从中间节点开始将后续链表逆序
        SingleListNode prev = null;
        SingleListNode cur = middle;
        while (cur != null) {
            SingleListNode next = cur.next;
            if (next == null) {
                //说明此时的cur已经是链表最后一个节点了，更新头节点的位置。
                middle = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        while (middle != null) {
            if (head.val != middle.val) {
                //对应元素不同，说明不是回文结构
                return false;
            }
            head = head.next;
            middle = middle.next;
        }
        return true;
    }

    public static SingleListNode middle(SingleListNode head) {
        SingleListNode slow = head;
        SingleListNode fast = head;
        while (fast != null) {
            if (fast.next == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
