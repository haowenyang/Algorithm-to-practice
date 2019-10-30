package Arraylist;

public class largest_sum_of_consecutive_subarrays {
    public static void main(String[] args) {
        int[] array={-2,-8,-1,-5,-9};
        int sun=FindGreatestSumOfSubArray(array);
        System.out.println(sun);
    }
    /*
    * 最大子序列的和
    * */
    public static int FindGreatestSumOfSubArray(int[] array){

        if (array.length==0 || array==null) {
            return 0;
        }
        int temp=Integer.MIN_VALUE;
        int Sum=array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp<=0) {
                temp=array[i];
            }else {
                temp+=array[i];
            }
            if (temp>Sum) {
                Sum=temp;
            }
        }
        return Sum;
    }
}

