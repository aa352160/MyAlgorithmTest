package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/9/21.
 *
 * 请设计一个复杂度为O(n)的算法，计算一个未排序数组中排序后相邻元素的最大差值。
 * 给定一个整数数组A和数组的大小n，请返回最大差值。保证数组元素个数大于等于2小于等于500。
 * 测试样例：
 * [9,3,1,10],4
 * 返回：6
 */
public class MaxDivision {
    public int findMaxDivision(int[] A, int n) {
        int maxnum=A[0];
        int minnum=A[0];
        for (int i = 1; i < A.length; i++) {
            if (maxnum<A[i]){
                maxnum=A[i];
            }
            if (minnum>A[i]){
                minnum=A[i];
            }
        }
        int[] nums=new int[maxnum-minnum+1];
        for (int i = 0; i < A.length; i++) {
            nums[A[i]-minnum]++;
        }
        int count=0,max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                if (max<count){
                    max=count;
                }
                count=0;
            }
            count++;
        }
        return max;
    }
}
