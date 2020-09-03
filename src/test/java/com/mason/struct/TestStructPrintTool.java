package com.mason.struct;

import com.mason.tool.ListTool;
import com.mason.tool.PrintTool;

/**
 * Created by mwu on 2020/8/25
 */
public class TestStructPrintTool {

    public static void main(String[] args) {
        int n = 5;
        SingleListNode singleHead = ListTool.buildSingleList(n, 10);
        PrintTool.print(singleHead);

        TwoWayListNode twoWayHead = ListTool.buildTwoWayList(n, 10);
        PrintTool.print(twoWayHead);
        TwoWayListNode reverseHead = ListTool.reverseList(twoWayHead);
        PrintTool.printFromTail(reverseHead);
    }
}
