package CyC;

import java.util.ArrayList;
import java.util.List;

public class L524_FindLongestWord {
    public static String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length(), l2 = target.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) {
                continue;
            }
            if (isSubstr(s, target)) {
                longestWord = target;
            }
        }
        return longestWord;
    }
    public static boolean isSubstr(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public static void main(String[] args) {
        String s="abpcplea";
        List<String> d=new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("money");
        d.add("plea");
        String s1=findLongestWord(s,d);
        System.out.println(s1);
    }
}
