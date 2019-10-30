package Sort;

public class Select_sort {
    /*选择排序*/
    public static void main(String[] args) {
        int []array={2,5,8,6,1,9};
        select(array);
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
    public static void select(int array[]){
        int i,temp,min;
        for ( i=0;i<array.length-1;i++){
            min=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[min]){
                    min=j;
                }
            }
            temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
    }
}
