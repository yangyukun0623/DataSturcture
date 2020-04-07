package DataStructure.Linked;

public class LinkedList<E> {

    /**
     * ��������ͷ��������
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

    private Node head;
    private int size;

    public LinkedList () {
        head = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //������ͷ������
    public void addHead(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        //�����ĵȼ۷���
        head = new Node(e, head);
        this.size++;
    }

    //�������м������
    public void insert(int index, E e) {
        if (index == 0) {
            addHead(e);
        } else if (index < size) {
            Node pre = head;    //�ҵ����������ǰһ�����
            for(int i = 0; i < index - 1; i++) {
                pre = pre.next;
            }
//            Node node = new Node(e);
//            node.next = pre.next;
//            pre.next = node;

            //�򻯴���
            pre.next = new Node(e, pre.next);
        } else {
            throw new ArrayIndexOutOfBoundsException("�±�Խ��");
        }
        this.size++;
    }

    //������ĩβ����µ�Ԫ��
    public void addTail(E e) {
        insert(size, e);
    }
}
