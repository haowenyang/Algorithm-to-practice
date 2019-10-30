package CyC;

import java.util.ArrayList;
import java.util.List;

public class L241_diffWaysToCompute {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new ArrayList<>();
        if(input.length()==0)
            return list;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c=='+'||c=='-'||c=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for (int l : left) {
                    for (int r : right) {
                        switch (c){
                            case '+':
                                list.add(l+r);
                                break;
                            case '-':
                                list.add(l-r);
                                break;
                            case '*':
                                list.add(l*r);
                                break;
                        }
                    }
                }
            }
        }
        if (list.size()==0){
            list.add(Integer.valueOf(input));
        }
        return list;
    }
    public static void main(String[] args) {
        String input = "2*3-4*5";
        List<Integer> list = new ArrayList<>();
        list = new L241_diffWaysToCompute().diffWaysToCompute(input);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
