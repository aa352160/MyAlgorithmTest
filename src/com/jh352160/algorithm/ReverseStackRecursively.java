package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/9/20.
 *
 * 一个栈依次压入1,2,3,4,5那么从栈顶到栈底分别为5,4,3,2,1。将这个栈转置后，从栈顶到栈底为1,2,3,4,5，
 * 也就是实现了栈中元素的逆序，请设计一个算法实现逆序栈的操作，但是只能用递归函数来实现，而不能用另外的数据结构。
 * 给定一个栈Stack以及栈的大小top，请返回逆序后的栈。
 * 测试样例：
 * [1,2,3,4,5],5
 * 返回：[5,4,3,2,1]
 */
public class ReverseStackRecursively {
    public int[] reverseStackRecursively(int[] stack, int top) {
        // write code here
        int[] a=new int[top];
        return reverse(stack,a,top);
    }

    public int[] reverse(int[] a,int[] b,int top){
        if (top==0){
            return b;
        }
        b[b.length-top]=a[top-1];
        return reverse(a,b,top-1);
    }
}
