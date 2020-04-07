package DataStructure.Stack;

public class StackByLinked {
    private Node head;      //头结点
    private int size;       //链表长度

    StackByLinked() {
        this.size = 0;
        head.next = null;
    }
    //结点类
    private class Node {
        Object data;    //数据域
        Node next;      //指向下一结点的指针
        Node(Object value) {
            this.data = value;
            this.next = null;
        }
    }
    public void push(Object value) {
        Node newNode = new Node(value);     //创建一个新结点
        if (size == 0) {
            head = newNode;
        } else {

        }
    }
}
