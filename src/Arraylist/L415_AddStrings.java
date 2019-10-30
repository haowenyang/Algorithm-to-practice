package Arraylist;

public class L415_AddStrings {
    public static void main(String[] args) {
        String num1="9";
        String num2="99";
        String add=addStrings(num1,num2);
        System.out.println(add);
    }
    public static String addStrings(String num1, String num2){
        if (num1.equals(0)||num2.equals(0)){
            return "0";
        }
        StringBuilder stringBuilder=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int car=0;
        while (i>=0||j>=0){
            int m=i>=0?num1.charAt(i)-'0':0;
            int n=j>=0?num2.charAt(j)-'0':0;
            int temp=m+n+car;
            car=temp/10;
            stringBuilder.append(temp%10);
            i--;
            j--;
        }
        if (car==1){
            stringBuilder.append(1);}
        return stringBuilder.reverse().toString();
    }
}
