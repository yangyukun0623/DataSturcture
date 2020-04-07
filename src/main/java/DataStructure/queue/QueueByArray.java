package DataStructure.queue;

import java.util.Queue;

public class QueueByArray<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public QueueByArray(int capacity) {
        data = (E[])new Object[capacity + 1];
        front = tail = 0;
        size = 0;
    }

    public QueueByArray() {
        this(10);
    }

    public int getCapacity() {
        return data.length - 1;
    }

    public boolean isEmpty() {
        return front == tail;
    }

    public int getSize() {
        return size;
    }

    public void enQueue(E e) {
        if ((tail + 1) % data.length == front)
            reSize(getCapacity() * 2);
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    public E deQueue() {
        if (isEmpty())
            throw new IllegalArgumentException();
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0)
            reSize(getCapacity() / 2);
        return ret;
    }

    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException();
        return data[front];
    }

    private void reSize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, getCapacity()));
        res.append("front [ ");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail ");
        return res.toString();
    }


    public static void main(String[] args) {
        QueueByArray<Integer> queue = new QueueByArray<>();
        for (int i = 0; i < 10; i++) {
            queue.enQueue(i);
            System.out.println(queue);
            if (i % 3 == 2)
                queue.deQueue();
        }
    }
}




































































