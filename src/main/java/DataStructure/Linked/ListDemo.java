package DataStructure.Linked;

/**
 * ����ṹ�������ʵ��
 *
 * @author xue
 *
 * @param <E>
 */
public class ListDemo<E> {
    // ָ������ͷ
    private Node<E> head;// ����ͷ null��ָ����е�һ��Ԫ��
    private int length;// �����нڵ���� 0

    /*
     * ����һ��������
     */
    public ListDemo() {
        this.head = new Node<E>();// ��ʼ��ͷ���
    }

    /**
     * ���һ��E����
     *
     * @param e
     * @return
     */
    public Node<E> add(E e) {
        // 1����װ�ڵ�
        Node<E> node = new Node<E>(e);
        // 2���ҵ�����β�����еĽڵ��next��null���Ǹ��ڵ��������β
        // �����״β���Ԫ�أ������ǿյģ�head==null

        Node<E> p = head;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        p.setNext(node);

        length++;
        return node;
    }

    /*
     * ��ӡ�����е�����Ԫ��
     */
    public void printList() {
        Node<E> p = head;// head��ֵ���ܱ�
        if (p == null) {
            System.out.println("���");
            return;
        }
        while (p != null) {
            System.out.println(p);
            p = p.getNext();
        }
    }

    /**
     * ɾ�������е�indexλ���ϵ�Ԫ��
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        Node<E> p = head.getNext();

        // 1���ҵ���index��Ԫ��λ��;index��0��ʼ
        for (int i = 0; p != null && i < index - 1; i++) {
            p = p.getNext();
        }
        // 2���õ�ǰԪ�ص�nextָ��Ҫɾ��Ԫ�ص���һ��Ԫ��
        E data = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        return data;
    }

    /**
     * �жϵ�ǰ�����Ƿ�Ϊ�ձ�����Ƿ���true�����򷵻�false
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
     * ���ص�i��λ���ϵ�Ԫ�أ���0��ʼ����
     *
     * @param i
     * @return
     */

    public E get(int i) {
        Node<E> p = head.getNext();// ����һ����ʱ����pָ��ͷ���
        if (i < 0 || i > length - 1) {
            System.out.println("��ȡ��λ�ò���ȷ");
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
     * ��Ԫ��e���뵽���Ա�ĵ�indexλ���ϣ���0��ʼ����
     *
     * @param e
     * @param index
     * @return
     */
    public Node<E> insert(E e, int index) {
        Node<E> p = head.getNext();

        // �½��ķ�װ
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
     * ����һ��Ԫ��e�������λ�ã����Ԫ�ش��ڣ����ص�ǰԪ�ص�λ�ã��������ڣ�����-1
     *
     * @param e
     * @return pos
     */
    public int indexOf(E e) {
        if (isEmpty()) {
            System.out.println("���");
            return -1;
        }
        int pos = 0;
        Node<E> p = head.getNext();
        while (p != null) {// �ж��Ƿ��Ѿ��鵽��β�����ҵ�ǰԪ�ص�Ԫ�ز�����Ҫ���ҵ�Ԫ��
            if(p.getData().equals(e)) {
                return pos;
            }
            p = p.getNext();
            pos++;
        }
        return -1;


    }

}
