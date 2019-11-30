package com.lulu.runtime;

public class RuntimeTest01 {


  /**
   * 作用是在jvm中增加一个关闭的钩子，当jvm关闭的时候，会执行系统中已经设置的所有通过方法addShutdownHook添加的钩子，
   * 当系统执行完这些钩子后，jvm才会关闭。所以这些钩子可以在jvm关闭的时候进行内存清理、对象销毁等操作。
   *
   * 1、程序正常退出
   * 2、使用System.exit()
   * 3、终端使用Ctrl+C触发的中断
   * 4、系统关闭
   * 5、OutOfMemory宕机
   * 6、使用Kill pid命令干掉进程（注：在使用kill -9 pid时，是不会被调用的）
   *
   */
  public static void main(String[] args) throws InterruptedException {

    System.out.println("before add hook");
    new RuntimeTest01().myHook();
    System.out.println("after add hook");


    Thread.sleep(1000);
    System.out.println("====start=====");
//     第二种
//    System.exit(0);
//     oom -Xmx5M
//    byte[] b = new byte[100*1024*1024];

    Runtime.getRuntime().halt(0);
    System.out.println("====over=====");


  }


  public void myHook() {
    Runtime.getRuntime().addShutdownHook(new MyThread("add shut down hook"));
  }

  class MyThread extends Thread {

    private String name;

    public MyThread(String name){
      this.name = name;
    }

    @Override
    public void run() {
      System.out.println(name + ": is comming");
    }
  }
}
