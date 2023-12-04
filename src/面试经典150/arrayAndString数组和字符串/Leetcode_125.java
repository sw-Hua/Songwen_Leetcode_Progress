package 面试经典150.arrayAndString数组和字符串;

public class Leetcode_125 {
    public static void main(String[] args) {
        String s = "!@#$%^&*()1234567890)(*&^%$#@!";

        System.out.println(new Solution_125().isPalindrome(s));
    }



}
class Solution_125{
    // 题解：https://www.bilibili.com/video/BV11f4y1m74T/?spm_id_from=333.337.search-card.all.click&vd_source=84511e871acbfc33728e984a63d553d9

        public boolean isPalindrome(String s) {
            if(s.trim().length()==0 || s.length() == 0)  return true;
            int i = 0;
            int j = s.length() - 1;

            while( i < j){

                while(i < j && !Character.isLetterOrDigit(s.charAt(i)) ){
                    // https://chat.openai.com/share/7472b8f4-2672-45e2-8e70-d34a25101d91
                    // isLetterOrDigit的使用
                    // 特殊情况 全是非letter digit就会一直执行下去

                    i++;
                }

                while( i < j && !Character.isLetterOrDigit(s.charAt(j))){
                    // 到这两步的时候，i和j都已经是增或减过了，如果不是字母也不是数字就++ -- 往前面推
                    j--;
                }

                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }

                i++;
                j--;
            }

            return true;

        }

}
