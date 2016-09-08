package com.jh352160.algorithm;

import java.util.Stack;

/**
 * Created by jh352160 on 2016/9/8.
 *
 * 对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
 * 给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
 * 测试样例：
 * 输入1->2->2->1
 * 返回：true
 */

public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        Stack<Integer> stack=new Stack<>();
        ListNode nextNode=A;
        int size=0;
        while(nextNode!=null){
            size++;
            nextNode=nextNode.next;
        }
        if((size&1)==1){
            return false;
        }
        for(int i=0;i<size/2;i++){
            stack.push(A.val);
            A=A.next;
        }
        for(int i=size/2;i<size;i++){
            if(stack.pop()!=A.val){
                return false;
            }
            A=A.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}