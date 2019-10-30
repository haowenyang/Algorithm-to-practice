package String;

import java.util.StringTokenizer;

public class ReverseSentence {
    public static void main(String[] args) {
        String string="this is a";
        reverseSentence(string);
    }
    public static void reverseSentence(String line){
        StringTokenizer stringTokenizer=new StringTokenizer(line," ");
        String string=" ";
        while (stringTokenizer.hasMoreTokens()){
           string=stringTokenizer.nextToken()+" "+string;
        }
        System.out.println(string);
    }
}
