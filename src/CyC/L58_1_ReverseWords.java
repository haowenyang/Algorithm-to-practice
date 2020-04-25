package CyC;

public class L58_1_ReverseWords {
    public static void main(String[] args) {
        String s =  "a good   example";
        System.out.println(s.trim());
        String[] strings = s.trim().split(" ");
        for (String s1:
             strings) {
            System.out.println(s1);
        }
    }
}
