package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/9/8.
 *
 * 对于一个矩阵，请设计一个算法，将元素按“之”字形打印。具体见样例。
 * 给定一个整数矩阵mat，以及他的维数nxm，请返回一个数组，其中元素依次为打印的数字。
 * 测试样例：
 * 输入：[[1,2,3],[4,5,6],[7,8,9],[10,11,12]],4,3
 * 返回：[1,2,3,6,5,4,7,8,9,12,11,10]
 */
public class Printer {
    public int[] printMatrix(int[][] mat, int n, int m) {
        int[] ans = new int[m*n];
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[flag++] = mat[i][Math.abs((i&1)*(m-1)-j)];
            }
        }
        return ans;
    }
}
