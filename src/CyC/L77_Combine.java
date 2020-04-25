package CyC;

import java.util.ArrayList;
import java.util.List;

public class L77_Combine {
    public static void main(String[] args) {
        int n =4,k=2;
        List<List<Integer>> res =combine(n,k);
        for (List<Integer> l:
             res) {
            System.out.println(l);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> res=new ArrayList<>();
        if(n<1||k<1||n<k)
            return res;
        List<Integer> list =new ArrayList<>();
        backtrack(1,n,k,list,res);
        return res;
    }
    private static void backtrack(int first,int n,int k,List<Integer> list,List<List<Integer>> res) {
        if(list.size()==k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=first;i<=n-(k-list.size())+1;i++) {
            list.add(i);
            backtrack(i+1,n,k,list,res);
            list.remove(list.size()-1);
        }
    }
}
