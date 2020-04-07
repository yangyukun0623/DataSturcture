package DataStructure.Linked;

public class TestLinked {
    public static void testSingleLinkedList(){
        SingleLinkedList single = new SingleLinkedList();
        single.addHead("A");
        single.addHead("B");
        single.addHead("C");
        single.addHead("D");
        //打印当前链表信息
        single.display();
        //删除C
        single.delete("C");
        single.display();
        //查找B
        System.out.println(single.find("B"));
    }

    public static void main(String[] args) {
        testSingleLinkedList();
    }
}
