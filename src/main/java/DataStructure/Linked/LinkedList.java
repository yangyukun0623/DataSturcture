package DataStructure.Linked;

public class LinkedList<E> {

    /**
     * 不带虚拟头结点的链表
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

    //在链表头插入结点
    public void addHead(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        //更简洁的等价方法
        head = new Node(e, head);
        this.size++;
    }

    //在链表中间插入结点
    public void insert(int index, E e) {
        if (index == 0) {
            addHead(e);
        } else if (index < size) {
            Node pre = head;    //找到待插入结点的前一个结点
            for(int i = 0; i < index - 1; i++) {
                pre = pre.next;
            }
//            Node node = new Node(e);
//            node.next = pre.next;
//            pre.next = node;

            //简化代码
            pre.next = new Node(e, pre.next);
        } else {
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        this.size++;
    }

    //在链表末尾添加新的元素
    public void addTail(E e) {
        insert(size, e);
    }
}
