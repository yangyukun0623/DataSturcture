package Bit;

public class BitDemo02 {
    public static void main(String[] args) {
        //�������^

        //�����У�ֻ��һ����ֻ����һ�Σ�����������Σ��ҳ�����һ�ε���
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4};
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = tmp ^ arr[i];
        }
        System.out.println(tmp);


    }
}
