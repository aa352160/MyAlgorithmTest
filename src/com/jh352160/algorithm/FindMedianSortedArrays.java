package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/10/12.
 *
 * 4. Median of Two Sorted Arrays  QuestionEditorial Solution  My Submissions
 *
 *
 *Total Accepted: 121094 Total Submissions: 600483 Difficulty: Hard
 *There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 *Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 *Example 1:
 *nums1 = [1, 3]
 *nums2 = [2]
 *
 *The median is 2.0
 *Example 2:
 *nums1 = [1, 2]
 *nums2 = [3, 4]
 *
 *The median is (2 + 3)/2 = 2.5
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int last = 0, totalLength = nums1.length + nums2.length, j = 0, index1 = 0, index2 = 0;
        if (nums1.length == 0 && nums2.length == 0) return 0;
        while (j < totalLength / 2 && index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] > nums2[index2]) {
                last = nums2[index2];
                index2++;
            } else {
                last = nums1[index1];
                index1++;
            }
            j++;
        }
        while (j < totalLength / 2 && index1 < nums1.length) {
            last = nums1[index1++];
            j++;
        }
        while (j < totalLength / 2 && index2 < nums2.length) {
            last = nums2[index2++];
            j++;
        }
        if (totalLength % 2 != 0) {
            if (index1 == nums1.length) {
                return (double) nums2[index2];
            }
            if (index2 == nums2.length) {
                return (double) nums1[index1];
            }
            if (nums1[index1] > nums2[index2]) {
                return (double) nums2[index2];
            } else {
                return (double) nums1[index1];
            }
        } else {
            if (index1 == nums1.length) {
                return (double) (nums2[index2] + last) / 2;
            }
            if (index2 == nums2.length) {
                return (double) (nums1[index1] + last) / 2;
            }
            if (nums1[index1] > nums2[index2]) {
                return (double) (nums2[index2] + last) / 2;
            } else {
                return (double) (nums1[index1] + last) / 2;
            }
        }
    }
}
