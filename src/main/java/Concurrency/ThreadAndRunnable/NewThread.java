package Concurrency.ThreadAndRunnable;
/**
 * �����̵߳Ķ��ַ�ʽ
 *
 * �̳�Thread��
 * ʵ��Runnable�������ڲ���ķ�ʽ
 * ������ֵ���߳�
 * ��ʱ��
 * �̳߳ص�ʵ��
 * Lambda���ʽʵ��
 * */
public class NewThread {


    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("ThreadDemo1");
        ThreadDemo1 demo1 = new ThreadDemo1();
        ThreadDemo1 demo2 = new ThreadDemo1();
        demo1.start();
        demo2.start();
    }
}
class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("�߳�" + Thread.currentThread().getName() + "ִ�����ˣ�����");
        }
    }
}

class ThreadDemo2 implements Runnable {
    @Override
    public void run() {

    }
}




































































