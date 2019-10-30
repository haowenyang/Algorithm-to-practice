package Stack1;

public class Array_implementation_stack {
    private int top;
    private int capacity;
    public int[] array;
    public Array_implementation_stack(){
        capacity=1;
        array=new int[capacity];
        top=-1;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isStackFull(){
        return (top==array.length);
    }
    public void push(int data){
        if (isStackFull()==true){
            System.out.println("栈满");
        }
        else {
            array[++top]=data;
        }
    }
    public int pop(){
        if (isEmpty()==true){
            System.out.println("栈空");
        }
        return array[top--];
    }
    public void detelestack(){
        top=-1;
    }
}
