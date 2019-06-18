package com.company.concurrency;//: concurrency/SettingDefaultHandler.java 919
import java.util.concurrent.*;

public class SettingDefaultHandler {
  public static void main(String[] args) throws InterruptedException {
    Thread.setDefaultUncaughtExceptionHandler(
      new MyUncaughtExceptionHandler());
    ExecutorService exec = Executors.newCachedThreadPool();
    exec.execute(new ExceptionThread());
    TimeUnit.SECONDS.sleep(1);
    exec.shutdown();
  }
} /* Output:
caught java.lang.RuntimeException
*///:~
