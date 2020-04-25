package CyC;

public class L190_ReverseBits {
    public static void main(String[] args) {

    }
    public static int reverseBits(int n) {
        int res = 0;
        int i =32;
        while(i-1>0){
            res<<=1;
            res+=n&1;
            n>>=1;
        }
        return res;
    }
}
