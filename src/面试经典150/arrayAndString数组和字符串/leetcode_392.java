package 面试经典150.arrayAndString数组和字符串;

public class leetcode_392 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {

        // 如果是空直接返回true
        if(s == null || s.isEmpty()) return true; // 短序列为空直接返回true

        //如果是s比t还要大直接返回false，不可能出现子序列
        if(s.length() > t.length()) return false;

        // 把string变成char toCharArray
        char [] ss = s.toCharArray();
        char [] tt = t.toCharArray();

        // 双指针开始，结束标志：i和j任何一个指针触碰到length
        int i = 0;
        int j = 0;
        while(i < ss.length && j < tt.length ){
            if(ss[i] == tt[j]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        //进到里面如果两个指针指向的字母一样，i++，j++，如果不一样j++接着找
        if(i == ss.length) return true;

        return false;
    }

}
