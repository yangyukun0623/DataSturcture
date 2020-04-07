package DataStructure.Linked;

/**
 * ʹ������ʵ��ջ
 *  ��head��ɾ��Ԫ�أ������ף�����tail����Ԫ�أ�����β��
 *  û������ͷ��㣬ע������Ϊ�յ����
 * */
public class QueueByLinked<E> {

    //�����
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

    //ͷ��㣬β���
    private Node head, tail;
    private int size;

    public QueueByLinked() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    public E deQueue() {
        if (isEmpty())
            throw new IllegalArgumentException("empty queue");
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null)
            tail = null;
        size--;
        return retNode.e;
    }

    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException();
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");
        Node cur = head;
        while (cur != null) {
            res.append(cur + " -> ");
            cur = cur.next;
        }
        res.append(" null tail");
        return res.toString();
    }

    public static void main(String[] args) {
        QueueByLinked<Integer> queue = new QueueByLinked<>();
        for (int i = 0; i < 10; i++) {
            queue.enQueue(i);
            System.out.println(queue);
        }
        queue.deQueue();
        System.out.println(queue);
    }
}





































