package DataStructure.Array;
/**
 * @author 坤坤
 *
 * 用类封装数组实现数据结构
 * 1.如何插入一条新的数据项
 * 2.如何寻找某一特定的数据项
 * 3.如何删除某一特定的数据项
 * 4.如何迭代的访问各个数据项，一边进行显示或其他操作
 * */
public class MyArray {
    //定义一个int类型数组
    private int[] intArray;

    //定义数组实际有效长度
    private int elems;

    //定义数组的最大长度
    private int length;

    //默认构造一个长度为50的数组
    public MyArray(){
        elems = 0;
        length = 0;
        intArray = new int[50];
    }

    //构造函数，初始化一个长度为length的数组
    public MyArray(int length){
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }

    //导入数组
    public MyArray(int[] arr){
        length = elems = arr.length;
        intArray = arr;
    }

    //获取数组的有效长度
    public int getSize(){
        return elems;
    }

    //遍历显示元素
    public void display(){
        for (int i = 0; i < elems; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * 添加元素
     * @param value,假设操作人是不会添加重复元素
     * @return 添加成功返回true，添加元素超过了范围返回false
     * */
    public boolean add(int value){
        if (elems == length)
            return false;
        else {
            intArray[elems] = value;
            elems++;
        }
        return true;
    }

    /**
     * 根据下标获取元素
     * @param i
     * @return 查找下标值在数组下标有效范围以内，返回所表示的元素
     * 查找下标超出数组有效值，提示访问下标越界
     * */
    public int get(int i){
        if (i < 0 || i > elems){
            System.out.println("访问下标越界");
        }
        return intArray[i];
    }

    /**
     * 查找元素
     * @param searchValue
     * @return 查找元素如果存在则返回下标值，如果不存在，返回-1
     *
     * */
    public int find(int searchValue){
        int i;
        for (i = 0; i < elems; i++){
            if (intArray[i] == searchValue){
                break;
            }
        }
        if (i == elems){
            return -1;
        }
        return i;
    }

    /**
     * 删除元素
     * @param value
     * @return 如果要删除的元素不存在，直接返回false；否则返回true
     * */
    public boolean delete(int value){
        int k = find(value);
        if (k == -1)
            return false;
        else {
            if (k == elems - 1){
                elems--;
            }else {
                for (int i = k; i < elems - 1; i++){
                    intArray[i] = intArray[i + 1];
                }
            }
            return true;
        }
    }

    /**
     * 修改元素
     * @param oldValue 原值
     * @param newValue 新值
     * @return 修改成功返回true，修改失败返回false
     * */
    public boolean modify(int oldValue,int newValue){
        int i = find(oldValue);
        if (i == -1){
            System.out.println("需要修改的数据不存在");
            return false;
        }else {
            intArray[i] = newValue;
            return true;
        }
    }

    //根据冒泡排序对数组进行排序
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

}
