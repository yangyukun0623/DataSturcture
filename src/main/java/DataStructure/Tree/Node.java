package DataStructure.Tree;

/**
 * �������Ľ����
 *
 * */
public class Node<E> {
    E data;      //�ڵ�����
    Node leftChild;   //���ӽڵ������
    Node rightChild;  //���ӽڵ������

    public Node(E data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
