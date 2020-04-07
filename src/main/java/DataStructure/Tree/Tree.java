package DataStructure.Tree;
/**
 * �������ľ��巽��
 *
 * */
public interface Tree<E> {
    //���ҽ��
    public Node find(E key);
    //�����½ڵ�
    public boolean insert(E key);
    //ɾ���ڵ�
    public boolean delete(E key);
    //�������
    public void infixOrder(Node current);
    //ǰ�����
    public void preOrder(Node current);
    //�������
    public void postOrder(Node current);
    //�������ֵ
    public Node findMax();
    //������Сֵ
    public Node findMin();
}
