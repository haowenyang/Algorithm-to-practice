package CyC;

public class L167_TwoSum {
    public static void main(String[] args) {
        int[] array={2,3,4};
        int[]result=twoSum(array,6);
        for (int i:result) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        if(numbers.length<2){
            return result;
        }
        int i=0,j=numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]==target){
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            else if (numbers[i]+numbers[j]>target){
                j--;
            }
            else {
                i++;
            }
        }
        return result;
    }
}

