package 面试经典150.arrayAndString数组和字符串;

public class leetcode169 {
    public static void main(String[] args) {
        int [] nums1 = {3, 2, 3};
        int [] nums2 = {2, 2, 1, 1, 1, 1, 2};
        int [] nums3 = {1, 2, 3, 2, 2, 2, 2, 4, 4};

        new Solution169().majorityElement(nums2);

    }
    // 多数元素
    static class Solution169 {
        public int majorityElement(int[] nums) {
            int x = 0, votes = 0;
            for (int num : nums){
                if (votes == 0) x = num;
                votes = num == x ? ++votes : --votes;
            }
            return x;
        }
    }
}
