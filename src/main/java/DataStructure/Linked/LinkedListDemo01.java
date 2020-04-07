package DataStructure.Linked;

/**
 * �Զ����������
 *
 * */
public class LinkedListDemo01 {
    Node head = null;   //ͷ���


    class Node {
        int data;     // �ڵ�����
        Node next = null;   //�ڵ����ã�ָ����һ���ڵ�
        public Node(int e) {
            this.data = e;
        }
    }

    /**
     * �������������
     * @param data
     * */
    public void insertData(int data) {
        Node newNode = new Node(data);  //ʵ����һ���ڵ�
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }
}
