package com.mason.tool;

/**
 * Created by mwu on 2020/8/25
 * 搜索工具
 */
public class SearchTool {

    /**
     * 二分查找
     *
     * @param data  数据源数组
     * @param value 查找目标
     * @return 下标，不存在则-1
     */
    public static int binarySearch(int[] data, int value) {
        if (data.length == 0) return -1;
        int left = 0, right = data.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (data[middle] == value) {
                return middle;
            } else if (data[middle] > value) {
                right--;
            } else {
                left++;
            }
        }
        return -1;
    }
}
