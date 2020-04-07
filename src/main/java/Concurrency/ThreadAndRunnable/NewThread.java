package Concurrency.ThreadAndRunnable;
/**
 * 创建线程的多种方式
 *
 * 继承Thread类
 * 实现Runnable接匿名内部类的方式
 * 带返回值的线程
 * 定时器
 * 线程池的实现
 * Lambda表达式实现
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
            System.out.println("线程" + Thread.currentThread().getName() + "执行例了！！！");
        }
    }
}

class ThreadDemo2 implements Runnable {
    @Override
    public void run() {

    }
}




































































