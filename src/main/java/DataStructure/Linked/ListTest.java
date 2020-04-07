package DataStructure.Linked;

public class ListTest {

    public static void main(String[] args) {
        ListDemo<String> list = new ListDemo<>();
        for(int i=0;i<10;i++) {
            list.add("测试数据 " + i);
        }

        /*
         * 删除元素，从0开始数
         */
//		String data = list.remove(4);
//		System.out.println("删除的元素是"+data);

        list.printList();

        //查找第index元素的位置
        System.out.println(list.get(3));
        System.out.println(list.indexOf(list.get(9)));
        System.out.println(list.indexOf("aaa"));



    }

}
