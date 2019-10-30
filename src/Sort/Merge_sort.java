package Sort;

public class Merge_sort {
    /*归并排序*/
    public static void main(String[] args) {
        int []array={7,5,8,6,1,9};
        int []newMerge=merge(array,0,array.length-1);
        for(int i:newMerge){
            System.out.println(i);
        }
    }
    public static int []merge(int array[],int l,int r){
        if (l==r){
            return new int[]{array[l]};
        }
        int mid=(l+r)/2;
        int []leftarr=merge(array,l,mid);
        int []rightarr=merge(array,mid+1,r);
        int []newarr=new int[leftarr.length+rightarr.length];
        int i=0,j=0,k=0;
        while (i<leftarr.length&&j<rightarr.length){
            newarr[k++]=leftarr[i]<rightarr[j]?leftarr[i++]:rightarr[j++];
        }
        while (i<leftarr.length){
            newarr[k++]=leftarr[i++];
        }
        while (j<rightarr.length){
            newarr[k++]=rightarr[j++];
        }
        return newarr;
    }
}
