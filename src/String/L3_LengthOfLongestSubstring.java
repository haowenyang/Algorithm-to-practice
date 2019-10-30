package String;

import java.util.HashMap;
import java.util.Map;

public class L3_LengthOfLongestSubstring {
    public static void main(String[] args) {
        String string="au";
        int length=lengthOfLongestSubstring(string);
        System.out.println(length);
    }
    public static int lengthOfLongestSubstring(String s) {
       int length=0;
       if (s.length()==0||s.length()==1){
           return s.length();
       }
       Map<Character,Integer> map=new HashMap<>();
       int j=0;
        for (int i = 0; i <s.length() ; i++) {
            if (map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i)));
            }
            length=Math.max(length,i-j+1);
            map.put(s.charAt(i),i+1);
        }
        return length;
    }
}
