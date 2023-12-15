package 面试经典150.arrayAndString数组和字符串;

import java.util.HashMap;

public class Leetcode_205 {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        new Solution_205().isIsomorphic(s, t);
    }

}
class Solution_205 {
    public boolean isIsomorphic(String s, String t) {
        if( s == null || t == null || s.length() != t.length())  return false;

        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            // 依次去除字符串
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                if(map.get(a) == b){
                    continue;
                }else{
                    return false;
                }
            }else{
                if (map.containsValue(b)){
                    return false;
                }else{
                    map.put(a, b);
                }
            }
        }

        return true;
    }
}
