package CyC;

public class L392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c:s.toCharArray()) {
            index = t.indexOf(c,index+1);
            if (index==-1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        boolean bool = new L392_IsSubsequence().isSubsequence(s,t);
        System.out.println(bool);
    }
}
