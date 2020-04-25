package CyC;

public class L10_IsMatch {
    public static void main(String[] args) {
        String s = "ab";
        String p = ".*";
        System.out.println(isMatch(s,p));
    }
    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()){
            return s.isEmpty();
        }
        boolean head = !s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        if (p.length()>=2&&p.charAt(1)=='*'){
            return isMatch(s,p.substring(2))||(head&&isMatch(s.substring(1),p));
        }
        else if (head){
            return isMatch(s.substring(1),p.substring(1));
        }
        else
            return false;
    }

}
