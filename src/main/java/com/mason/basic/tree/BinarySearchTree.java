package com.mason.basic.tree;

import com.mason.struct.TreeNode;
// https://blog.csdn.net/l_ppp/article/details/108307532?utm_medium=distribute.pc_feed.none-task-blog-vip_agree_hot-1.nonecase&depth_1-utm_source=distribute.pc_feed.none-task-blog-vip_agree_hot-1.nonecase

/**
 * Created by mwu on 2020/9/3
 * 二叉查找树
 */
public class BinarySearchTree {

    private TreeNode root = null;

    public void insert(int value) {
        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
        } else {
            invertNode(root, node);
        }
    }

    private void invertNode(TreeNode root, TreeNode node) {
        if (root.value <= node.value) {
            if (root.left == null) {
                root.left = node;
            } else {
                this.invertNode(root.left, node);
            }
        } else {
            if (root.right == null) {
                root.right = node;
            } else {
                this.invertNode(root.right, node);
            }
        }
    }
}
