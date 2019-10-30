package Sort;


import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        System.out.println(pr(8));
    }
    public static boolean pr(int n){
      return n>0&&(n&n-1)==0;
    }
}
