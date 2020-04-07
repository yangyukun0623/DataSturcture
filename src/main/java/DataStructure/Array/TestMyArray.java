package DataStructure.Array;

public class TestMyArray {
    public static void main(String[] args) {
        //创建自定义封装数组结构，数组大小为4
        MyArray arr = new MyArray(4);
        //添加4个元素1,2,3,4
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        //显示数组元素
        arr.display();
        //根据下标为0的元素
        int i = arr.get(0);
        System.out.println(i);

        //删除4的元素
        arr.delete(4);

        //将3修改成33
        arr.modify(3, 33);

        arr.display();
    }
}
