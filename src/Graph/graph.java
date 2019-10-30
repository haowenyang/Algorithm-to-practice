package Graph;

public class graph {
    /*邻接矩阵表示图*/
    private int adjMatrix[][];//邻接矩阵
    private int vertex; //顶点数
    public graph(int vertex){
        this.vertex=vertex;
        adjMatrix=new int[vertex][vertex];
    }

    public static void main(String[] args) {
        System.out.println("1");
    }

}
