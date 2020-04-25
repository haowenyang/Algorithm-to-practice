package CyC;

public class L125_IsPalindrome {
    public static void main(String[] args) {
        String s ="race a car";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s == null|| s.length() == 0)
            return true;

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c <= 'z'){
                sb.append(c);
            }else if(c >= 'A' && c <= 'Z'){
                c = (char)(c - 'A' + 'a');
                sb.append(c);
            }else if(c >= '0' && c <= '9'){
                sb.append(c);
            }
        }
        String b = sb.toString();
        int i=0,j=b.length()-1;
        while (i<=j){
            if (b.charAt(i)==b.charAt(j)){
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }
}
