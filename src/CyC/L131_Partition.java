package CyC;

import java.util.ArrayList;
import java.util.List;

public class L131_Partition {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> lists=partition(s);
        for (List<String> l:
             lists) {
            System.out.println(l);
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> lists =new ArrayList<>();
        if (s==""||s.length()==0)
            return lists;
        List<String> list =new ArrayList<>();
        back(s,0,lists,list);
        return lists;
    }
    public static void back(String s,int index,List<List<String>> lists,List<String> list){
        if (index==s.length()){
            lists.add(new ArrayList<>(list));
        }
        for (int i = index; i <s.length() ; i++) {
            if (!huiwen(s.substring(index,i+1))){
                continue;
            }
            list.add(s.substring(index,i+1));
            back(s,i+1,lists,list);
            list.remove(list.size()-1);
        }
    }
    public static boolean huiwen(String s){
       int i =0;
       int j =s.length()-1;
       while (i<=j){
           if (s.charAt(i)==s.charAt(j)){
               i++;
               j--;
           }else
               return false;
       }
       return true;
    }
}
