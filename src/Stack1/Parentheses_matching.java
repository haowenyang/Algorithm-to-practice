package Stack1;

import java.util.Stack;

public class Parentheses_matching {
    public static void main(String[] args) {
        String s="()[]{}";
        Boolean bool=isValid(s);
        System.out.println(bool);
    }
    public static boolean isValid(String s) {
        char [] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
       for (int i=0;i<chars.length;i++){
            if (chars[i]==')'){
                if (!stack.isEmpty()&&stack.peek().equals('(')){
                   stack.pop();
                }
            }
            else if (chars[i]==']'){
                if (!stack.isEmpty()&&stack.peek().equals('[')){
                    stack.pop();
                }
            }else if( chars[i]=='}'){
                if (!stack.isEmpty()&&stack.peek().equals('{')){
                    stack.pop();
                }
            }else {
                stack.push(chars[i]);
            }
            if (stack.isEmpty()){
                return true;
            }else {
                return false;
            }
    }
       return false;
}}

