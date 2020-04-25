package CyC;

public class L79_Exist {
    public static void main(String[] args) {
      char[][]  board =
              {
                      {'A', 'B', 'C', 'E'},
                      {'S', 'F', 'C', 'S'},
                      {'A', 'D', 'E', 'E'}
              };
       String word = "ABCB";
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        if (board.length==0)
            return false;
       boolean[][]visit =new boolean[board.length][board[0].length] ;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==word.charAt(0)){
                    visit[i][j]=true;
                    if (back(board,word,0,i,j,visit)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean back(char[][]board,String word,int index,int i,int j,boolean[][]visit){
        if (index==word.length()){
            return true;
        }
        if (i<0||i>=board.length||j<0||j>=board[0].length){
            return false;
        }
        if (visit[i][j]||board[i][j]!=word.charAt(index))
            return false;
        if (!visit[i][j]&&board[i][j]==word.charAt(index)){
            visit[i][j]=true;
            if (back(board,word,index+1,i+1,j,visit)||back(board,word,index+1,i,j+1,visit)||back(board,word,index+1,i-1,j,visit)||back(board,word,index+1,i,j-1,visit)){
                return true;
            }
            visit[i][j]=false;
        }
        return false;
    }
}
