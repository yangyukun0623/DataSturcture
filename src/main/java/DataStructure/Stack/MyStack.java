package DataStructure.Stack;

public class MyStack {
    private int[] array;
    private int maxSize;
    private int top;

    public MyStack(int size){
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }

    //ѹ������
    public void push(int value){
        if (top < maxSize - 1){
            array[++top] = value;
        }
    }

    //����ջ������
    public int pop(){
        return array[top--];
    }

    //����ջ������
    public int peek(){
        return array[top];
    }

    //�ж�ջ�Ƿ�Ϊ��
    public boolean isEmpty(){
        return (top == -1);
    }


}
