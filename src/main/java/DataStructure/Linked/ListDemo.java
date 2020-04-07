package DataStructure.Linked;

/**
 * 链表结构的设计与实现
 *
 * @author xue
 *
 * @param <E>
 */
public class ListDemo<E> {
    // 指定链表头
    private Node<E> head;// 链表头 null，指向表中第一个元素
    private int length;// 链表中节点个数 0

    /*
     * 创建一个空链表
     */
    public ListDemo() {
        this.head = new Node<E>();// 初始化头结点
    }

    /**
     * 添加一个E类型
     *
     * @param e
     * @return
     */
    public Node<E> add(E e) {
        // 1、封装节点
        Node<E> node = new Node<E>(e);
        // 2、找到链表尾，表中的节点的next是null的那个节点就是链表尾
        // 若是首次插入元素，链表是空的，head==null

        Node<E> p = head;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        p.setNext(node);

        length++;
        return node;
    }

    /*
     * 打印链表中的所有元素
     */
    public void printList() {
        Node<E> p = head;// head的值不能变
        if (p == null) {
            System.out.println("表空");
            return;
        }
        while (p != null) {
            System.out.println(p);
            p = p.getNext();
        }
    }

    /**
     * 删除链表中第index位置上的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        Node<E> p = head.getNext();

        // 1、找到第index的元素位置;index从0开始
        for (int i = 0; p != null && i < index - 1; i++) {
            p = p.getNext();
        }
        // 2、让当前元素的next指向要删除元素的下一个元素
        E data = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        return data;
    }

    /**
     * 判断当前链表是否为空表，如果是返回true，否则返回false
     *
     * @return
     */
    public boolean isEmpty() {
        if (head.getNext() == null) {
            return true;
        }
        return false;
    }

    /**
     * 返回第i个位置上的元素，从0开始计数
     *
     * @param i
     * @return
     */

    public E get(int i) {
        Node<E> p = head.getNext();// 定义一个临时变量p指向头结点
        if (i < 0 || i > length - 1) {
            System.out.println("获取的位置不正确");
            return null;
        }
        int k = 1;
        while (k <= i) {
            p = p.getNext();
            k++;
        }
        return p.getData();
    }

    /**
     * 把元素e插入到线性表的第index位置上，从0开始计数
     *
     * @param e
     * @param index
     * @return
     */
    public Node<E> insert(E e, int index) {
        Node<E> p = head.getNext();

        // 新结点的封装
        Node<E> s = new Node<>(e);

        int k = 0;
        while (k < index) {
            p = p.getNext();
            k++;
        }
        s.setNext(p.getNext());
        p.setNext(s);
        return s;

    }

    /**
     * 查找一个元素e在链表的位置，如果元素存在，返回当前元素的位置；若不存在，返回-1
     *
     * @param e
     * @return pos
     */
    public int indexOf(E e) {
        if (isEmpty()) {
            System.out.println("表空");
            return -1;
        }
        int pos = 0;
        Node<E> p = head.getNext();
        while (p != null) {// 判断是否已经查到表尾，并且当前元素的元素不是索要查找的元素
            if(p.getData().equals(e)) {
                return pos;
            }
            p = p.getNext();
            pos++;
        }
        return -1;


    }

}
