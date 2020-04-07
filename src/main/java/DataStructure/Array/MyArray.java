package DataStructure.Array;
/**
 * @author ����
 *
 * �����װ����ʵ�����ݽṹ
 * 1.��β���һ���µ�������
 * 2.���Ѱ��ĳһ�ض���������
 * 3.���ɾ��ĳһ�ض���������
 * 4.��ε����ķ��ʸ��������һ�߽�����ʾ����������
 * */
public class MyArray {
    //����һ��int��������
    private int[] intArray;

    //��������ʵ����Ч����
    private int elems;

    //�����������󳤶�
    private int length;

    //Ĭ�Ϲ���һ������Ϊ50������
    public MyArray(){
        elems = 0;
        length = 0;
        intArray = new int[50];
    }

    //���캯������ʼ��һ������Ϊlength������
    public MyArray(int length){
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }

    //��������
    public MyArray(int[] arr){
        length = elems = arr.length;
        intArray = arr;
    }

    //��ȡ�������Ч����
    public int getSize(){
        return elems;
    }

    //������ʾԪ��
    public void display(){
        for (int i = 0; i < elems; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * ���Ԫ��
     * @param value,����������ǲ�������ظ�Ԫ��
     * @return ��ӳɹ�����true�����Ԫ�س����˷�Χ����false
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
     * �����±��ȡԪ��
     * @param i
     * @return �����±�ֵ�������±���Ч��Χ���ڣ���������ʾ��Ԫ��
     * �����±곬��������Чֵ����ʾ�����±�Խ��
     * */
    public int get(int i){
        if (i < 0 || i > elems){
            System.out.println("�����±�Խ��");
        }
        return intArray[i];
    }

    /**
     * ����Ԫ��
     * @param searchValue
     * @return ����Ԫ����������򷵻��±�ֵ����������ڣ�����-1
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
     * ɾ��Ԫ��
     * @param value
     * @return ���Ҫɾ����Ԫ�ز����ڣ�ֱ�ӷ���false�����򷵻�true
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
     * �޸�Ԫ��
     * @param oldValue ԭֵ
     * @param newValue ��ֵ
     * @return �޸ĳɹ�����true���޸�ʧ�ܷ���false
     * */
    public boolean modify(int oldValue,int newValue){
        int i = find(oldValue);
        if (i == -1){
            System.out.println("��Ҫ�޸ĵ����ݲ�����");
            return false;
        }else {
            intArray[i] = newValue;
            return true;
        }
    }

    //����ð������������������
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
