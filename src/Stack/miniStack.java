package Stack;

import java.util.Stack;
/*
* 题目：设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
*思路;一下插入两个数
* */
public class miniStack {
    Stack<Integer> stack=new Stack<>();
    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(x);
            stack.push(x);
        }else {
            int temp=stack.peek();
            stack.push(x);
            if (temp>x){
                stack.push(x);
            }else {
                stack.push(temp);
            }
        }
    }
    public void pop() {
        stack.pop();
        stack.pop();
    }
    public int top() {
        return stack.get(stack.size()-2);
    }

    public int getMin() {
        return stack.peek();
    }
    public static void main(String[] args) {
        miniStack minStack = new miniStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
