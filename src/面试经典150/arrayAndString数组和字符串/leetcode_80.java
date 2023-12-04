package 面试经典150.arrayAndString数组和字符串;
/*
示例 1：

输入：nums = [1,1,1,2,2,3]
输出：5, nums = [1,1,2,2,3]
解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
示例 2：

输入：nums = [0,0,1,1,1,1,2,3,3]
输出：7, nums = [0,0,1,1,2,3,3]
解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
 */
public class leetcode_80 {

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3}; // 0-8
        int [] nums2 = {1, 1, 1, 1, 2, 2, 3}; // 0-6
        int [] nums3 = {1,1,1,2,2,3}; // 0-6
        new Leetcode_80_solution().removeDuplicates(nums3);

    }
}
class Leetcode_80_solution{
    public int removeDuplicates(int[] nums) {
        int i = 1; // 慢指针 代表当前数组的最后一位
        int j = 2; // 快指针 代表当前的检测数组

        if (nums.length < 2){
            return nums.length;
        }

        while(j < nums.length){ // j--> 8 快指针没有遍历到8，就一直
            // 上上个应该被保留的元素 是否和当前待检查元素相同。
                if(nums[i-2] != nums[j]) {
                    // 则说明当前元素要么是第一次出现，要么是前一个相同元素的第二次出现。
                    // 在这种情况下，我们应该保留这个元素，将其复制到慢指针的位置，并将慢指针向前移动。
                    nums[i] = nums[j];
                    i++;
                }j++;
                // 如果相同 则说明这个元素至少是第三次出现（因为它与前面至少有两个相同的元素相同）。
            // 在这种情况下，我们不应该保留这个元素，只需将快指针向前移动以跳过它。
        }

        for (int num : nums) {
            System.out.println(num);
        }
        return 0;
    }
}
