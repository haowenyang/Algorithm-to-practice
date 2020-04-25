package CyC;

public class L371_GetSum {
    public static void main(String[] args) {
        System.out.println(getSum(-1,-2));
    }
    public static int getSum(int a, int b) {
        while(b!=0){
            int temp=a^b;
            b=(a&b)<<1;
            a=temp;
        }
        return a;
    }
}
