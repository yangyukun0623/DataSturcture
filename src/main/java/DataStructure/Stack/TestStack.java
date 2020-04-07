package DataStructure.Stack;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
