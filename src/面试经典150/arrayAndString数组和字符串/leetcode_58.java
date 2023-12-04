package 面试经典150.arrayAndString数组和字符串;

public class leetcode_58 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(new Leetcode_58Solution().lengthOfLastWord(s1));
    }
}
class Leetcode_58Solution{
    public int lengthOfLastWord(String s) {
        // 从后面来来扣
        int index = s.length() - 1;

        // 如果有空格，删掉空格
        while (s.charAt(index) == ' ') {
            index--;
        }

        // 记录wordLength，只要没有空格
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;
        }
        return wordLength;
    }
}
