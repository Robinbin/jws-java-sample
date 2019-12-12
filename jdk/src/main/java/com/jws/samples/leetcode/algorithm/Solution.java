package com.jws.samples.leetcode.algorithm;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 0};

        if (nums != null) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }

        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        return result;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
