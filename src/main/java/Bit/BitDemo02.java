package Bit;

public class BitDemo02 {
    public static void main(String[] args) {
        //异或运算^

        //数组中，只有一个数只出现一次，其余出现两次，找出出现一次的数
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4};
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = tmp ^ arr[i];
        }
        System.out.println(tmp);


    }
}
