package String;

public class StringMatch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int []b={2,4,4};
        System.out.println(stringMatch(a,b));
    }
    public static boolean stringMatch(int a[],int b[]) {
        for (int i = 0; i <a.length-b.length ; i++) {
            int j=0;
            while (j<b.length&&b[j]==a[j+i]){
                j++;
            }
            if (j==b.length){
                return true;
            }
        }
        return false;
    }
}
