package DataStructure.Linked;

public class ListTest {

    public static void main(String[] args) {
        ListDemo<String> list = new ListDemo<>();
        for(int i=0;i<10;i++) {
            list.add("�������� " + i);
        }

        /*
         * ɾ��Ԫ�أ���0��ʼ��
         */
//		String data = list.remove(4);
//		System.out.println("ɾ����Ԫ����"+data);

        list.printList();

        //���ҵ�indexԪ�ص�λ��
        System.out.println(list.get(3));
        System.out.println(list.indexOf(list.get(9)));
        System.out.println(list.indexOf("aaa"));



    }

}
