package DataStructure.Array;

public class TestMyArray {
    public static void main(String[] args) {
        //�����Զ����װ����ṹ�������СΪ4
        MyArray arr = new MyArray(4);
        //���4��Ԫ��1,2,3,4
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        //��ʾ����Ԫ��
        arr.display();
        //�����±�Ϊ0��Ԫ��
        int i = arr.get(0);
        System.out.println(i);

        //ɾ��4��Ԫ��
        arr.delete(4);

        //��3�޸ĳ�33
        arr.modify(3, 33);

        arr.display();
    }
}
