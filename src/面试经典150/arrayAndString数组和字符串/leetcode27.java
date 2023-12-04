package 面试经典100.arrayAndString数组和字符串;

public class leetcode27 {

    public static void main(String[] args) {
        int [] nums = {2,2,6,5,3};
        int val = 2;
        new Solution27().removeElementMethod2(nums, val);
    }

}class Solution27{
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for(int num: nums) {
            if(num != val) {
                nums[ans] = num;
                ans++;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("ans: " + ans);
        return ans;
    }

    public int removeElementMethod2(int[] nums, int val) {
        int ans = nums.length;
        for (int i = 0; i < ans;) {
            if (nums[i] == val) {
                nums[i] = nums[ans - 1];
                ans--;
            } else {
                i++;
            }
        }
        return ans;
    }

}

