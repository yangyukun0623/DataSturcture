package Bit;

import java.util.Random;

public class SumWord {
    public static void main(String[] args) {
        //���ظ���������1000��
        int N = 1000;
        //���������Ϊ10��������һ��Ϊ�ظ���
        int[] array = new int[N + 1];
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
        Random random = new Random();
        //����1~N�������
        int same = random.nextInt(N) + 1;
        int position = random.nextInt(N);
        //���ظ���ֵ�������λ��
        array[N] = array[position];
        array[position] = same;
        //ǰ��һ���־���Ϊ�˲���1001��С�����飬������һ�����ظ���
        //����������
        int x = 0;
        for (int i = 0; i < N; i++) {
            x = (x ^ (i + 1));
        }
        //���������������
        int y = 0;
        for (int i = 0; i < N + 1; i++) {
            y = (array[i] ^ y);
        }
        //��ӡ����ظ���ֵ
        System.out.println(x ^ y);
    }
}
