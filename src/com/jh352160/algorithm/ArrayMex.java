package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/9/22.
 *
 * 请设计一个高效算法，查找数组中未出现的最小正整数。
 * 给定一个整数数组A和数组的大小n，请返回数组中未出现的最小正整数。保证数组大小小于等于500。
 * 测试样例：
 * 输入：[-1,2,3,4],4
 * 返回：1
 */
public class ArrayMex {

    public int findArrayMex(int[] A, int n) {
        // write code here
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }


        for (int i = 0; i < A.length; i++) {
            if (A[i]==1){
                break;
            }
            if (A[i]>0){
                return 1;
            }
        }

        for (int i = 0; i < n-1; i++) {
            if (A[i]<1){
                continue;
            }
            if (A[i]!=A[i+1]-1&&A[i]!=A[i+1]){
                return A[i]+1;
            }
        }

        return A[n-1]+1;
    }

}
