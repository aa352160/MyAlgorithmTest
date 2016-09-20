package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/9/20.
 *
 * 对于一个没有重复元素的整数数组，请用其中元素构造一棵MaxTree，MaxTree定义为一棵二叉树，
 * 其中的节点与数组元素一一对应，同时对于MaxTree的每棵子树，它的根的元素值为子树的最大值。
 * 现有一建树方法，对于数组中的每个元素，其在树中的父亲为数组中它左边比它大的第一个数和右边比它大的第一个数中更小的一个。
 * 若两边都不存在比它大的数，那么它就是树根。请证明这个方法的正确性，同时设计O(n)的算法实现这个方法。
 * 给定一个无重复元素的数组A和它的大小n，请返回一个数组，其中每个元素为原数组中对应位置元素在树中的父亲节点的编号，若为根则值为-1。
 * 测试样例：
 * 输入：[3,1,4,2],4
 * 返回：[2,0,-1,2]
 */
public class BuildMaxTree {

    public static int[] buildMaxTree(int[] A, int n) {
        // write code here
        int[] a=new int[n];
        for (int i = 0; i < A.length; i++) {
            int temp=A[i],tempNode=-1;
            for (int j = i-1; j >= 0; j--) {
                if (A[j]>A[i]){
                    temp=A[j];
                    tempNode=j;
                    break;
                }
            }
            for (int j = i+1; j < A.length; j++) {
                if (A[j]>A[i]){
                    if (A[j]<temp||temp==A[i]) {
                        tempNode = j;
                    }
                    break;
                }
            }
            a[i]=tempNode;
        }
        return a;
    }

}
