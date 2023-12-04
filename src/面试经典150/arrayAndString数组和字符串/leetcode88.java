package 面试经典100.arrayAndString数组和字符串;

import java.util.Arrays;

//88. 合并两个有序数组
public class leetcode88 {

    public static void main(String[] args) {

        int [] nums1 = {1, 2, 3, 0, 0, 0};

        int [] nums2 = {2, 5, 6};


        new Solution88().merge2(nums1, 3, nums2, 3);
    }



}
class Solution88 {
    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        //在Java中，数组的大小一旦确定就不能再改变。如果要修改数组的大小，您需要创建一个新数组，并将原数组中的元素复制到新数组中。

        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 合并两个数组
        int [] merge = new int [m+n];

        for (int i = 0; i < m; i++) {
            merge[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            merge[m+i] = nums2[i];
        }

        // 冒泡排序
        boolean swapped = true;
        do {
            swapped = false;
            for (int i = 1; i < merge.length; i++) {
                if (merge[i - 1] > merge[i]){ // 前一位大于后一位 比如 0 > 1
                    int temp = merge[i - 1];
                    merge[i - 1] = merge[i];
                    merge[i] = temp;
                    swapped = true;
                }
            }
        }while (swapped); // do while 只有满足要求才能

        // 复制内容
        nums1 = Arrays.copyOf(merge, merge.length);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
