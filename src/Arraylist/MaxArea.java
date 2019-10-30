package Arraylist;

public class MaxArea {
    public static void main(String[] args) {
        int[] array={1,8,6,2,5,4,8,3,7};
        int n=maxArea(array);
        System.out.println(n);
    }
    public static int maxArea(int[] height){
        int max=0;
        int left=0,right=height.length-1;
        while (left<right){
            int num=Math.min(height[left],height[right])*(right-left);
            if (num>max){
                max=num;
            }
            if (height[left] < height[right]){
                left++;
            }
            else
                right--;
        }
        return max;
    }
}
