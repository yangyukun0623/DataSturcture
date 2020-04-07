package Concurrency.CallableAndRunnable;

import sun.awt.windows.ThemeReader;

/**
 * 线程创建有七个状态
 * 1.初始化状态，调用start方法
 * 2.就绪状态，
 * 3.运行状态，一旦抢占到CPU资源就有就绪状态转到运行状态
 * 4.超时等待状态(sleeping)
 * 5.等待状态(waiting)
 * 6.阻塞状态(blocked)
 * 7.终止状态(dead)
 * */
public class ThreadState implements Runnable{
    @Override
    public synchronized void run() {

        while (true){
            System.out.println("自定义的线程执行了" + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState ts = new ThreadState();
        //初始化状态
        Thread t1 = new Thread(ts);   //创建线程，并指定线程任务
        Thread t2 = new Thread(ts);
        t1.start(); //启动线程，状态改成就绪状态，直到抢占到CPU资源才转为运行状态
        while (true){
            System.out.println("主线程执行了。。。。");
            Thread.sleep(1000);
        }
    }
}






































































