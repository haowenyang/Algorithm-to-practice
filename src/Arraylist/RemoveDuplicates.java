package Arraylist;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []array={1,1,2};
        System.out.println(removeDuplicates(array));
    }
    public static int removeDuplicates(int nums[]){
        if (nums.length==0||nums==null){
            return 0;
        }
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
