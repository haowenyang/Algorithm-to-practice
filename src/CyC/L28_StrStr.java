package CyC;

public class L28_StrStr {
    public static void main(String[] args) {
       String haystack ="mississippi", needle = "issip";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
       int m =haystack.length();
       int n =needle.length();
       if (n==0){
           return 0;
       }
       if (m==0)
           return -1;
        for (int i = 0; i <m-n+1; i++) {
            int j=0;
            for (; j <n ; j++) {
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if (j==m)
                return i;
        }
        return -1;
    }
}
