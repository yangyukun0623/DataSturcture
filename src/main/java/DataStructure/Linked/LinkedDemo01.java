package DataStructure.Linked;

public class LinkedDemo01<E> {

    /**
     * ������ͷ��������
     *
     *
     * */
    private class Node {
        E e;
        Node next;
        Node (E e, Node next) {
            this.e = e;
            this.next = next;
        }
        Node(E e) {
            this(e, null);
        }

        Node() {
            this(null, null);
        }

        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedDemo01 () {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //�������м������
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = new Node(e, pre.next);
        this.size++;
    }

    //������ͷ������
    public void addHead(E e) {
        insert(0, e);
    }

    //������ĩβ����µ�Ԫ��
    public void addTail(E e) {
        insert(size, e);
    }

    //��ȡ�����ض�λ�õ�Ԫ��
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node current = dummyHead.next;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.e;
    }

    public E getHead() {
        return get(0);
    }

    //��ȡ���һ��Ԫ��
    public E getLast() {
        return get(size - 1);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node cur = dummyHead.next;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //����Ԫ��
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node resNode = pre.next;    //Ҫɾ���Ľ��
        pre.next = resNode.next;
        resNode.next = null;
        this.size--;
        return resNode.e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + " -> ");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedDemo01<Integer> linked = new LinkedDemo01<>();
        for (int i = 0; i < 10; i++) {
            linked.addHead(i);
        }
        System.out.println(linked);
        linked.insert(2, 666);
        System.out.println(linked);
        System.out.println(linked.remove(2));
        System.out.println(linked);
    }
}
