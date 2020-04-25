package Stack;

public class Remove_outermost_parenthesis {

    /*
    * 题目：
    * */

    public static void main(String[] args) {
        String string="(()())(())";
        System.out.println(remove(string));
    }
    public static String remove(String string){
        if (string==""){
            return "";
        }
        char [] arraystr=string.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i=0;i<arraystr.length;i++){
            if (arraystr[i]=='('){
                count++;
                if (count>1){
                    sb.append(arraystr[i]);
                }
            }
            else if (arraystr[i]==')'){
                if (count>1){
                    sb.append(arraystr[i]);
                }
                count--;
            }
        }
        return sb.toString();
    }
}
