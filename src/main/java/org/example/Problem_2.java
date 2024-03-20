package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Problem_2 {
    public static int[] getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> mas1 = new HashSet<>();
        for (int a : nums1) {
            mas1.add(a);
        }

        int[] commonElements = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int num : nums2) {
            if (mas1.contains(num)) {
                commonElements[index++] = num;
                mas1.remove(num);
            }
        }
        return Arrays.copyOf(commonElements, index);
    }
}