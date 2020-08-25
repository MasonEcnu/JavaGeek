package com.mason.tool;

import com.mason.struct.SingleListNode;
import com.mason.struct.TwoWayListNode;

/**
 * Created by mwu on 2020/8/25
 * 打印输出工具
 */
public class PrintTool {

    public static void print(SingleListNode head) {
        SingleListNode curr = head;
        StringBuilder sb = new StringBuilder("SingleList[");
        while (curr != null) {
            sb.append(curr.val).append(" --> ");
            curr = curr.next;
        }
        sb.append("null]");
        System.out.println(sb.toString());
    }

    public static void print(TwoWayListNode head) {
        TwoWayListNode curr = head;
        StringBuilder sb = new StringBuilder("TwoWayList[");
        while (curr != null) {
            sb.append(curr.val).append(" <--> ");
            curr = curr.next;
        }
        sb.append("null]");
        System.out.println(sb.toString());
    }
}
