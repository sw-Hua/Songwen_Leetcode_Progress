package 面试经典150.arrayAndString数组和字符串;

import java.util.HashMap;

public class leetcode_290 {
    public static void main(String[] args) {
        String pattern = "abbc";
        String str = "dog cat cat dog";
        new Solution290().wordPattern(pattern, str);
    }
}class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String [] words = str.split(" "); // 遇到空格就分割
        if(pattern.length() != words.length) return false;

        HashMap<Character,String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(c) && !wordToChar.containsKey(word)) {
                // 如果没有hashmap中同时不包含两个key，就添加进去
                charToWord.put(c, word);
                wordToChar.put(word, c);
            } else {
                // getOrDefault 方法用于从映射中获取指定键的值，如果键不存在，则返回默认值。
                if (!charToWord.getOrDefault(c, "").equals(word) ||
                        !wordToChar.getOrDefault(word, (char)0).equals(c)) {
                    // 比对两个hashmap中的值是否相等 如果不相等就返回false
                    return false;
                }
            }
        }

        return true;
    }
}
