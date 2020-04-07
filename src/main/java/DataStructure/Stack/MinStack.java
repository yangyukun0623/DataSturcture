package DataStructure.Stack;


public class MinStack {
    private int minElem;

    public MinStack() {
        head = null;
    }
    private class Node {
        int data;
        Node next;
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        Node (int data) { this(data, null); }
        Node () { this(0, null); }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    private Node head;      //Í·½áµã
    private int size;

    public void push(int x) {
        if (size == 0)
            this.minElem = x;
        else
            this.minElem = this.minElem > x ? x : this.minElem;
        Node newHead = new Node(x);
        if (size == 0)
            head = newHead;
        else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    public void pop() {
        if (size == 0)
            throw new IllegalArgumentException();
        int x = head.data;
        if (this.minElem > x)
            this.minElem = x;
        head = head.next;
        size--;
    }

    public int top() {
        if (size == 0)
            throw new IllegalArgumentException();
        return head.data;
    }

    public int getMin() {
        return this.minElem;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = head;
        while (cur != null) {
            res.append(cur + " -> ");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
