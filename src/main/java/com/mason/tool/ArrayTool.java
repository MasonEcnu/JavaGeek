package com.mason.tool;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Created by mwu on 2020/8/25
 * 数组构建工具
 */
public class ArrayTool {

    private static final Random random = new Random();

    @NotNull
    public static int[] buildArray(int n, int bound) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound) + 1;
        }
        return arr;
    }
}
