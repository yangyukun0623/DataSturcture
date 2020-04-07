package DataStructure.Tree;

import java.util.Comparator;

public class BinaryTree<E> implements Tree<E>{

    private Comparator<E> comparator;
    private Node root;

    public BinaryTree() {
        this.comparator = null;
    }

    public BinaryTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }
    @Override
    public Node find(E key) {
        Node cur = root;
        while (cur != null) {
            if (comparator.compare((E)(cur.data), key) > 0) {   //��ǰֵ�Ȳ���ֵ������������
                cur = cur.leftChild;
            } else if (comparator.compare((E)cur.data, key) < 0) {  //��ǰֵ�Ȳ���ֵ�£�����������
                cur = cur.rightChild;
            } else {
                return cur;
            }
        }
        return null;       //������������û�ҵ�������null
    }

    @Override
    public boolean insert(E key) {
        Node newNode = new Node(key);
        if (root == null) { //�����ǰ��Ϊ������û���κνڵ�
            root = newNode;
            return true;
        } else {
            Node cur = root;
            Node parent = null;
            while (cur != null) {
                parent = cur;
                if (comparator.compare((E)cur.data, key) > 0) { //��ǰֵ�Ȳ���ֵ���������ӽڵ�
                    cur = cur.leftChild;
                    if (cur == null) {  //���ӽڵ�Ϊ�գ�ֱ�ӽ���ֵ���뵽�ýڵ�
                        parent.leftChild = newNode;
                        return true;
                    }
                } else {
                    cur = cur.rightChild;
                    if (cur == null) {  //���ӽڵ�Ϊ�գ�ֱ�ӽ���ֵ���뵽�ýڵ�
                        parent.rightChild = newNode;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(E key) {
        return false;
    }

    //�������
    @Override
    public void infixOrder(Node current) {
        if (current != null) {
            infixOrder(current.leftChild);
            System.out.print(current.data + " ");
            infixOrder(current.rightChild);
        }
    }

    //ǰ�����
    @Override
    public void preOrder(Node current) {
        if (current != null) {
            System.out.println(current.data + " ");
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
        }
    }

    //�������
    @Override
    public void postOrder(Node current) {
        if (current != null) {
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
            System.out.println(current.data + " ");
        }
    }

    @Override
    public Node findMax() {
        return null;
    }

    @Override
    public Node findMin() {
        return null;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(20);
        bt.insert(80);
        bt.insert(10);
        bt.insert(30);
        bt.insert(60);
        bt.insert(90);
        bt.insert(25);
        bt.insert(85);
        bt.insert(100);
        bt.infixOrder(bt.root);
        System.out.println();
        bt.preOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }

}
