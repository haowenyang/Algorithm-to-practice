package Hash;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        char [] chars={'a','a','b'};
        remove(chars);
    }
    public static void remove(char[] s){
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i <s.length ; i++) {
            set.add(String.valueOf(s[i]));
        }
        for(String tmp:set)
            System.out.println(tmp);
    }
}
