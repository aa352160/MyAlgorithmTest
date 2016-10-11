package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/10/11.
 * <p>
 * 2. Add Two Numbers
 * <p>
 * Total Accepted: 193124 Total Submissions: 763027 Difficulty: Medium
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode travNode = listNode;
        int carryOver = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carryOver += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carryOver += l2.val;
                l2 = l2.next;
            }
            travNode.next = new ListNode(carryOver % 10);
            travNode = travNode.next;
            carryOver = carryOver / 10;
        }
        if (carryOver > 0) travNode.next = new ListNode(carryOver);
        return listNode.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
