package 面试经典150.arrayAndString数组和字符串;

import java.util.HashMap;
import java.util.Map;

public class leetcode_383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        Solution_383 solution383 = new Solution_383();
        solution383.canConstruct(ransomNote, magazine);
    }

}

class Solution_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 创建两个HashMap来分别记录字符的出现次数
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        // 统计ransomNote字符串中每个字符的出现次数
        for (char ch : ransomNote.toCharArray()) {
            ransomNoteMap.put(ch, ransomNoteMap.getOrDefault(ch, 0) + 1); // getOrDefault就是通过key来获取value，如果没有就返回后面设置的默认值
        }

        // 统计magazine字符串中每个字符的出现次数
        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }


        // 检查ransomNote中的每个字符是否在magazine中出现并且出现次数足够
        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) < count) {
                return false;
            }
        }

        return true;
    }
}
