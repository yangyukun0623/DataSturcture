package DataStructure.Linked;

/**
 * 不带虚拟头结点的循环链表
 * */

public class LoopLinkedList<E> {

    private class Node {
        E e;
        Node next;
        Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }
        Node(E e) {
            this(e, null);
        }
        Node() {
            this(null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    //头结点
    private Node head;
    private int size;

    public LoopLinkedList() {
        head = null;
        size = 0;
    }

    //尾插法插入结点
    public void add(E e) {
        if (head == null) {
            //循环链表只有一个结点
            head = new Node(e);
            head.next = head;
        } else {
            //找到指向第一个结点的结点
            Node target;
            for (target = head; target.next != head; target = target.next);
            //生成一个新的结点
            Node temp = new Node(e, head);
            target.next = temp;
        }
        size++;
    }

    public void addHead(E e) {
        head = new Node(e, head);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        int i = size;
        Node cur = head;
        while (i != 0) {
            res.append(cur + " -> ");
            cur = cur.next;
            i--;
        }
        res.append("null");
        return res.toString();
    }

    public String display(int len) {
        StringBuilder res = new StringBuilder();
        int i = len;
        Node cur = head;
        while (i != 0) {
            res.append(cur + " -> ");
            cur = cur.next;
            i--;
        }
        res.append("null");
        return res.toString();
    }
}
