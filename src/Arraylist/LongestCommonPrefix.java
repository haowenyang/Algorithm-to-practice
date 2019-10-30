package Arraylist;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        StringBuilder stringBuilder=new StringBuilder(strs[0]);
        char[] chars1=strs[0].toCharArray();
        int j=0;
        for (int k = 1; k < strs.length; k++) {
            StringBuilder stringBuilder2=new StringBuilder();
            int i=0;
            char[]chars2=strs[k].toCharArray();
            while (j<chars1.length&&i<chars2.length){
                if (chars1[j]==chars2[i]){
                    stringBuilder2.append(chars1[i]);
                    j++;
                    i++;
                }
                else {
                    i=chars2.length;
                }
            }
            j=0;
            stringBuilder=stringBuilder2.length()<stringBuilder.length()?stringBuilder2:stringBuilder;
        }
        return stringBuilder.toString();
    }
}

