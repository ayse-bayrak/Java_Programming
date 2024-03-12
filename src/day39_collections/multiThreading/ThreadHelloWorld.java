package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread{ // implements Runnable

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(" Hello world " +i + " from Thread "+threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
/*
Process: execution instance of program application

Thread: A sequence of execution within a process

Creating custom Thread in java:
		1. by inheriting Thread Class
		2. by inheriting Runnable Interface

Multi-threading:
	Multiple thread objects are executed at the same time

 */

}