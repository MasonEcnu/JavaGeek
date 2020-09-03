package com.mason.basic.linked_list;

import com.mason.struct.SingleListNode;
import com.mason.tool.ListTool;
import org.junit.Test;

/**
 * Created by mwu on 2020/9/1
 */
public class PalindromeListTest {

    @Test
    public void testPalindromeList() {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        SingleListNode head = ListTool.buildSingleList(arr);
        System.out.println(PalindromeList.isPalindrome(head));
    }
}