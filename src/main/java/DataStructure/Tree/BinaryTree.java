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
            if (comparator.compare((E)(cur.data), key) > 0) {   //当前值比查找值大，搜索左子树
                cur = cur.leftChild;
            } else if (comparator.compare((E)cur.data, key) < 0) {  //当前值比查找值下，搜索右子树
                cur = cur.rightChild;
            } else {
                return cur;
            }
        }
        return null;       //遍历完整个树没找到，返回null
    }

    @Override
    public boolean insert(E key) {
        Node newNode = new Node(key);
        if (root == null) { //如果当前树为空树，没有任何节点
            root = newNode;
            return true;
        } else {
            Node cur = root;
            Node parent = null;
            while (cur != null) {
                parent = cur;
                if (comparator.compare((E)cur.data, key) > 0) { //当前值比插入值大，搜索左子节点
                    cur = cur.leftChild;
                    if (cur == null) {  //左子节点为空，直接将新值插入到该节点
                        parent.leftChild = newNode;
                        return true;
                    }
                } else {
                    cur = cur.rightChild;
                    if (cur == null) {  //右子节点为空，直接将新值插入到该节点
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

    //中序遍历
    @Override
    public void infixOrder(Node current) {
        if (current != null) {
            infixOrder(current.leftChild);
            System.out.print(current.data + " ");
            infixOrder(current.rightChild);
        }
    }

    //前序遍历
    @Override
    public void preOrder(Node current) {
        if (current != null) {
            System.out.println(current.data + " ");
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
        }
    }

    //后序遍历
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
