package DataStructure.Linked;
/**
 * 使用链表实现栈
 *
 *
 * */
public class StackByLinked<E> {
    private LinkedDemo01<E> list;

    public StackByLinked() {
        list = new LinkedDemo01<>();
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E e) {
        list.addHead(e);
    }

    public E pop() {
        return list.remove(0);
    }

    public E peek() {
        return list.getHead();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args) {
        StackByLinked<Integer> stack = new StackByLinked<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
