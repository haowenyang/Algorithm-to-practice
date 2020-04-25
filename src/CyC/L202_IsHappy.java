package CyC;


import java.util.HashSet;
import java.util.Set;

public class L202_IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int slow = n,fast =n;
        do {
            slow=num(slow);
            fast=num(fast);
            fast=num(fast);
        }while (slow!=fast);
        return slow==1;
    }
    public static int num(int n){
        int m =0;
            while(n != 0){
                m += Math.pow(n%10, 2);
                n /= 10;
            }
        return m;
    }

}
