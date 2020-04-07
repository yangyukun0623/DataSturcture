package DataStructure.Linked;

/**
 * 自定义链表设计
 *
 * */
public class LinkedListDemo01 {
    Node head = null;   //头结点


    class Node {
        int data;     // 节点数据
        Node next = null;   //节点引用，指向下一个节点
        public Node(int e) {
            this.data = e;
        }
    }

    /**
     * 向链表插入数据
     * @param data
     * */
    public void insertData(int data) {
        Node newNode = new Node(data);  //实例化一个节点
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
