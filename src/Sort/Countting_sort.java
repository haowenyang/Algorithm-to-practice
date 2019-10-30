package Sort;

public class Countting_sort {
    /*计数排序*/

    public static void main(String[] args) {
        int []array={2,5,8,6,1,9};
        int b[]=count(array);
        for (int i:b){
           System.out.println(i);
       }
    }
    public static int[] count(int a[]) {
        int b[] = new int[a.length];
        int max = a[0],min = a[0];
        for(int i:a){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }//这里k的大小是要排序的数组中，元素大小的极值差+1
        int k=max-min+1;
        int c[]=new int[k];//中间数组
        for (int i=0;i<a.length;i++){
            c[a[i]-min]+=1;
        }
        for (int i=1;i<k;i++){
            c[i]=c[i]+c[i-1];
        }
        for (int i=a.length-1;i>=0;i--){
           b [--c[a[i]-min]]=a[i];
        }
        return b;
    }

}
