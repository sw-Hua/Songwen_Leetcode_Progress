package 面试经典150.arrayAndString数组和字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_15 {
    public static void main(String[] args) {
    }
    public List<List<Integer>> threeSum(int[] nums) {
        // 构造结果
        List<List<Integer>> res = new ArrayList();

        // null或者小于3 就返回
        if (nums == null || nums.length < 3) return res;

        // 排序 Arrays.sort(list)
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            // 这是一个便利数组
            // 去重 continue; 如果遇到continue，就跳过当前迭代
            if( i > 0 && nums[i] == nums[i-1]) continue;

            // 放到这个里面的目的是拿到i
            int start = i;
            int end = nums.length-1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == 0){
                    // 如果==0 添加进List里面 start++ end--
                    res.add(Arrays.asList(nums[i] , nums[start], nums[end]));
                    while(start < end && nums[start + 1] == nums[start]) start++;
                    while(start < end && nums[end - 1] == nums[end]) end++;

                    start++;
                    end--;

                }else if(sum < 0){
                    // 如果 < 0 说明总体的sum小了，end--
                    end--;
                }else if(sum > 0){
                    // 如果 > 0 说明总体sum大了，start++
                    start++;
                }
            }


            System.out.println(nums[i]);
        }

        return res;
    }
}
