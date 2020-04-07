package DataStructure.Tree;

/**
 * 二叉树的结点类
 *
 * */
public class Node<E> {
    E data;      //节点数据
    Node leftChild;   //左子节点的引用
    Node rightChild;  //右子节点的引用

    public Node(E data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
