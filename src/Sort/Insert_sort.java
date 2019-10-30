package Sort;

public class Insert_sort {
    /*插入排序*/
    public static void main(String[] args) {
        int []array={7,5,8,6,1,9};
        insert(array);
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
    public static void insert(int r[]){
        int i,j;
        int temp;
        for (i=1;i<r.length;i++)
        {
            temp = r[i];
            j=i-1;
            while (j>-1 &&temp<r[j])
            {
                r[j+1]=r[j];
                j--;
            }
            r[j+1]=temp;
        }
    }
}
