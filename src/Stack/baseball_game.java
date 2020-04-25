package Stack;

public class baseball_game {
    public static void main(String[] args) {
        String[] ops={"D"};
        System.out.println(calPoints(ops));
    }
    public static boolean calPoints(String[] ops) {
        for (int i=0;i<ops.length;i++){
            if (ops[i]=="C"){
                return true;

            }
        }
        return false;
    }

}
