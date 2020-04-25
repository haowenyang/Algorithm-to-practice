package CyC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L17_LetterCombinations {
    private static Map<Character, String> digitsMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    private static List<String> res = new ArrayList<String>();
    public static void main(String[] args) {
        letterCombinations("234");
        for (String s:
            res ) {
            System.out.println(s);
        }
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length()==0||digits=="")
            return res;
        find(digits,0,"");
        return res;
    }
    public static void find(String digits,int index,String s){
        if (digits.length()==index){
            res.add(s);
            return;
        }
        String temp = digitsMap.get(digits.charAt(index));
        for (int i = 0; i < temp.length(); i++) {
            find(digits,index+1,s+temp.charAt(i));
        }
    }

}
