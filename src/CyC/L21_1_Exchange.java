package CyC;

public class L21_1_Exchange {
    public static void main(String[] args) {

    }
    public int[] exchange(int[] nums) {
        if (nums.length==0)
            return nums;
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            while (left<right&&nums[left]%2==1)
                left++;
            while (left<right&&nums[right]%2==0)
                right--;
            swap(nums,left++,right--);
        }
        return nums;
    }
    public  void swap(int[] num,int i ,int j){
        int temp = num[i];
        num[i]=num[j];
        num[j]= temp;
    }
}
