package CyC;

import java.util.Arrays;

public class L455_FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length==0||s.length==0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i<g.length&&j<s.length){
            if (g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        int result = new L455_FindContentChildren().findContentChildren(g,s);
        System.out.println(result);
    }
}
