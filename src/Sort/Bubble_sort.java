package Sort;

public class Bubble_sort {
    /*冒泡排序*/

    public static void main(String[] args) {
        int []array={2,5,8,6,1,9};
        bubble(array);
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
    public static void bubble(int array[]){
        int temp;
        for (int i=1;i<array.length;i++){
            for (int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
