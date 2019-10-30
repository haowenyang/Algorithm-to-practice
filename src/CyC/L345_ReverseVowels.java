package CyC;

import java.util.Arrays;
import java.util.HashSet;

public class L345_ReverseVowels {
    private final static HashSet<Character> hashSet = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    );
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <=j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!hashSet.contains(ci))
            {
                result[i++] = ci;
            } else if (!hashSet.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }
    public static void main(String[] args) {
        L345_ReverseVowels l345_reverseVowels = new L345_ReverseVowels();
        String s = "leetcode";
        String s1= l345_reverseVowels.reverseVowels(s);
        System.out.println(s1);
    }
}
