package CyC;

public class L680_ValidPalindrome {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return compare(s,left+1,right)||compare(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean compare(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        L680_ValidPalindrome l680_validPalindrome = new L680_ValidPalindrome();
        String s = "ebcbbececabbacecbbcbe" ;
        boolean bool = l680_validPalindrome.validPalindrome(s);
        System.out.println(bool);
    }
}
