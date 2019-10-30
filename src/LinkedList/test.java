package LinkedList;

public class test{
    public static void main(String[] args) {
        String s1="123";
        String s2="123";
        String s3="abc";
        String s4="abc";
        String string1= new String("123") + new String("abc");
        string1.intern();
        String string="123abc";
        System.out.println(string1==string);
        }
    }






