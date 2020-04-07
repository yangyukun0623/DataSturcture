package Concurrency.CallableAndRunnable;

import sun.awt.windows.ThemeReader;

/**
 * �̴߳������߸�״̬
 * 1.��ʼ��״̬������start����
 * 2.����״̬��
 * 3.����״̬��һ����ռ��CPU��Դ���о���״̬ת������״̬
 * 4.��ʱ�ȴ�״̬(sleeping)
 * 5.�ȴ�״̬(waiting)
 * 6.����״̬(blocked)
 * 7.��ֹ״̬(dead)
 * */
public class ThreadState implements Runnable{
    @Override
    public synchronized void run() {

        while (true){
            System.out.println("�Զ�����߳�ִ����" + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState ts = new ThreadState();
        //��ʼ��״̬
        Thread t1 = new Thread(ts);   //�����̣߳���ָ���߳�����
        Thread t2 = new Thread(ts);
        t1.start(); //�����̣߳�״̬�ĳɾ���״̬��ֱ����ռ��CPU��Դ��תΪ����״̬
        while (true){
            System.out.println("���߳�ִ���ˡ�������");
            Thread.sleep(1000);
        }
    }
}






































































