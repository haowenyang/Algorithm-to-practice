package CyC;

public class L69_MySqrt {
    public int mySqrt(int x) {
        if (x <= 1) {
            return 1;
        }
        int l = 1,r = x;
        while (l<=r){
            int mid = l+(r-l)/2;
            int result = x/mid;
            if (result == mid)
                return result;
            else if (result<mid)
                r=mid-1;
            else
                l=mid+1;
        }        return r;

    }
    public static void main(String[] args) {
        int x =8;
        int result = new L69_MySqrt().mySqrt(x);
        System.out.println(result);
    }
}
