package CyC;

public class L633_JudgeSquareSum {
    public static void main(String[] args) {
        int c=5;
        System.out.println(judgeSquareSum(c));
    }
    public static boolean judgeSquareSum(int c){
        int left=0,right=(int)Math.sqrt(c);
        while (left<=right){
            int result=left*left+right*right;
            if (result==c){
                return true;
            }
            else if (result<c){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}
