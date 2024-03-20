package org.example;

public class Problem_3 {
    // Мой метод
   /* public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new  int[]{i, j};
                }
            }
        }
        return new int[]{};
    }*/
    // Лучший метод
   /* public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =1;i<n;i++){
            for(int j =i;j<n;j++){
                if(nums[j]+nums[j-i] == target) return new int [] {j-i,j};
            }
        }
        return null;
    }*/
}