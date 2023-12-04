package 面试经典150.arrayAndString数组和字符串;

public class leetcode26 {
    public static void main(String[] args) {
        int [] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int [] nums2 = {1,1,2};
        new Solution26().removeDuplicates(nums1);
    }
}class Solution26 {
    // 具体思路就是 遇到重复就接着遍历。遇到不重复就覆盖慢指针后一位。因为慢指针表示当前没有重复的最后一个元素。
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0; // 慢指针 当前没有重复的最后一个元素
        int q = 1; // 快指针 遍历数组
        while(q < nums.length){
            if(nums[p] != nums[q]){
                // 表示遇到非重复元素
                if(q - p > 1){
                    nums[p + 1] = nums[q];
                }else{
                    p++;
                }
            }else{
                q++; // 遇到重复元素q++
            }
        }
        return p + 1;
    }
}
