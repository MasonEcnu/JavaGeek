package com.mason.struct;

import com.mason.tool.VerifyTool;

import java.util.Scanner;

/**
 * Created by mwu on 2020/8/25
 */
public class TestVerifyTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String word = "";
        while (!"exit".equalsIgnoreCase(word)) {
            word = scanner.nextLine();
            System.out.println(VerifyTool.isIDNumber(word));
        }
        System.out.println("程序退出！");
    }
}
