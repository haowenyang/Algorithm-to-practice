package CyC;


import java.util.ArrayList;
import java.util.List;

public class L763_PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        if (S.length()==0){
            return null;
        }
        List<Integer> list =new ArrayList<>();
        int[] lastindex = new int[26];
        for (int i = 0; i <S.length() ; i++) {
            lastindex[S.charAt(i)-'a'] = i;
        }
        int first =0;
        while (first<S.length()){
            int index = lastindex[S.charAt(first)-'a'];
            for (int i = first+1; i < S.length()&&i<index; i++) {
                if (lastindex[S.charAt(i)-'a']>index){
                    index = lastindex[S.charAt(i)-'a'];
                }
            }
            list.add(index-first+1);
            first = index+1;
        }
        return list;
    }
    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";
        List<Integer> list =new L763_PartitionLabels().partitionLabels(S);
        for (int i:list) {
            System.out.println(i);
        }
    }
}
