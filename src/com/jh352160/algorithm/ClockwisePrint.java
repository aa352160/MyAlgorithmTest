package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/9/8.
 *
 * 对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针打印矩阵元素。
 * 给定int矩阵mat,以及它的维数nxm，请返回一个数组，数组中的元素为矩阵元素的顺时针输出。
 * 测试样例：
 * 输入：[[1,2],[3,4]],2,2
 * 返回：[1,2,4,3]
 */
public class ClockwisePrint {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        int nums = n * m;
        int[] Matrix = new int[nums];
        int i = 0;

        if (n == m) {
            Matrix[n * m - 1] = mat[n / 2][m / 2];
        }

        for (int line = 0; line < n; line++) {
            if (i == n * m) break;
            for (int u = 0 + line; u < m - 1 - line; u++) {
                Matrix[i] = mat[line][u];
                ++i;
                if (i == nums) break;
            }

            for (int k = 0 + line; k < n - 1 - line; k++) {
                Matrix[i] = mat[k][m - 1 - line];
                ++i;
                if (i == nums) break;
            }

            for (int v = m - 1 - line; v > 0 + line; v--) {
                Matrix[i] = mat[n - 1 - line][v];
                ++i;
                if (i == nums) break;
            }

            for (int b = n - 1 - line; b > 0 + line; b--) {
                Matrix[i] = mat[b][line];
                ++i;
                if (i == nums) break;
            }
        }
        return Matrix;
    }
}
