package DataStructure.Stack;

public class StackByLinked {
    private Node head;      //ͷ���
    private int size;       //������

    StackByLinked() {
        this.size = 0;
        head.next = null;
    }
    //�����
    private class Node {
        Object data;    //������
        Node next;      //ָ����һ����ָ��
        Node(Object value) {
            this.data = value;
            this.next = null;
        }
    }
    public void push(Object value) {
        Node newNode = new Node(value);     //����һ���½��
        if (size == 0) {
            head = newNode;
        } else {

        }
    }
}
