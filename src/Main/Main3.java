package Main;

import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
    public static HashSet<Integer> hashSet =new HashSet<>();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int f =scanner.nextInt();
        int i = 0;
        hashSet.add(f);
        while (i<m){
            int p = scanner.nextInt();
            int[] temp = new int[p];
            int j=0;
            while (j<p){
                temp[j++]=scanner.nextInt();
            }
            get(temp,hashSet);
            i++;
        }
        if (hashSet.size()>=n){
            System.out.println(n);
        }
        else {
            System.out.println(hashSet.size());
        }
    }
    public static void get(int[] num,HashSet<Integer> hashSet){
        boolean flag = false;
        for (int i = 0; i <num.length ; i++) {
            if (hashSet.contains(num[i])){
                flag=true;
                break;
            }
        }
        if (flag){
            for (int i = 0; i <num.length ; i++) {
                hashSet.add(num[i]);
            }
        }
    }
}
