package CyC;

public class L75_SortColors {
    public void sortColors(int[] nums) {
        if (nums.length<3)
            return;
        int left = 0;
        int right = nums.length-1;
        int temp = 0;
        while (temp<=right){
            if (nums[temp]==0){
                swap(nums,left,temp);
                left++;
                temp++;
            }
            else if (nums[temp]==2){
                swap(nums,temp,right);
                right--;
            }
            else {
                temp++;
            }
        }
    }

   public static void swap(int[] arr,int i,int j){
        int te=arr[i];
        arr[i] = arr[j];
        arr[j] = te;
   }

    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        L75_SortColors l75_sortColors = new L75_SortColors();
        l75_sortColors.sortColors(array);
        for (int i:array) {
            System.out.println(i);
        }
    }
}
