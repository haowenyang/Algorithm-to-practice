package Arraylist;

public class L43_Multiply {
    public static void main(String[] args) {
        String num1="123";
        String num2="456";
        String mult=multiply(num1,num2);
        System.out.println(mult);
    }
    public static String multiply(String num1, String num2) {
        String string="";
        int car=0;
        for (int i=num1.length()-1 ; i >=0 ; i--) {
            int m=num1.charAt(i)-'0';
            StringBuilder stringBuilder2=new StringBuilder();
            for (int k = 0; k <num1.length()-1-i ; k++) {
                stringBuilder2.append(0);
            }
            for (int j = num2.length()-1; j >=0 ; j--) {
                int n=num2.charAt(j)-'0';
                int temp=m*n+car;
                car=temp/10;
                stringBuilder2.append(temp%10);
            }
            if (car>0){
                stringBuilder2.append(car);
            }
            string=addStrings(string,stringBuilder2.reverse().toString());
            car=0;
        }
        return string;
    }
    public static String addStrings(String num1, String num2){
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1;
             i >= 0 || j >= 0 || carry != 0;
             i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            builder.append(sum);
            carry = (x + y + carry) / 10;
        }
        return builder.reverse().toString();
    }
}
