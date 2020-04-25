package CyC;

public class L674_FindLengthOfLCIS {
    public static void main(String[] args) {
        int[] num =new int[]{1,3,5,4,7};
        System.out.println(findLengthOfLCIS(num));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int res=1;
        if (nums.length<2)
            return nums.length;
        int temp=nums[0];
        int fin=res;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]>temp){
                res++;
            }
            else {
                fin=Math.max(fin,res);
                res=1;
            }
            temp=nums[i];
        }
        return fin;
    }
}
