package 面试经典150.arrayAndString数组和字符串;

import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public static void main(String[] args) throws Exception {
        int [] nums = {1, 17, 2, 7};
        int[] twoSum = new Solution_1().twoSum(nums, 9);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }

}
class Solution_1 {
    public int[] twoSum(int[] nums, int target) throws Exception {
        // 这一道算法的关键在于想清楚，如果有两个数可以找的那肯定一前一后的
        // 一前一后的，这个算法会先从前面开始找，找不到加数。
        // 不用担心会错过，因为一前一后，后面那个通过containsKey搜索全部之前的map里面的数，可以找到前面的

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // 计算余值
            int component = target - nums[i];
            // 是不是containsKey
            if(map.containsKey(component)){
                return new int[]{map.get(component), i};
            }
            // 没有的话就添加
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("");
    }
}
