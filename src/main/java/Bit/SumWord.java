package Bit;

import java.util.Random;

public class SumWord {
    public static void main(String[] args) {
        //不重复的数字有1000个
        int N = 1000;
        //数组的容量为10，其中有一个为重复的
        int[] array = new int[N + 1];
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
        Random random = new Random();
        //产生1~N的随机数
        int same = random.nextInt(N) + 1;
        int position = random.nextInt(N);
        //将重复的值随机调换位置
        array[N] = array[position];
        array[position] = same;
        //前面一部分就是为了产生1001大小的数组，其中有一个是重复的
        //进行异或操作
        int x = 0;
        for (int i = 0; i < N; i++) {
            x = (x ^ (i + 1));
        }
        //对数组进行异或操作
        int y = 0;
        for (int i = 0; i < N + 1; i++) {
            y = (array[i] ^ y);
        }
        //打印随机重复的值
        System.out.println(x ^ y);
    }
}
