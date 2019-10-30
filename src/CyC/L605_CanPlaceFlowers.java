package CyC;



public class L605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==0)
            return false;
        for (int i = 0; i <flowerbed.length ; i++) {
            if (flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
        }
        return n <= 0;
    }
    public static void main(String[] args) {
        int[] flowerbed ={0,0,1,0,1};
        int n = 1;
        boolean result = new L605_CanPlaceFlowers().canPlaceFlowers(flowerbed,n);
        System.out.println(result);
    }
}
