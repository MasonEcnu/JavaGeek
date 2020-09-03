package com.mason.struct;

/**
 * Created by mwu on 2020/9/3
 */
public class TreeNode {

    public int value;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
