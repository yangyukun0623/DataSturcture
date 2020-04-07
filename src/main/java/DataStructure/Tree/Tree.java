package DataStructure.Tree;
/**
 * 二叉树的具体方法
 *
 * */
public interface Tree<E> {
    //查找结点
    public Node find(E key);
    //插入新节点
    public boolean insert(E key);
    //删除节点
    public boolean delete(E key);
    //中序遍历
    public void infixOrder(Node current);
    //前序遍历
    public void preOrder(Node current);
    //后序遍历
    public void postOrder(Node current);
    //查找最大值
    public Node findMax();
    //查找最小值
    public Node findMin();
}
