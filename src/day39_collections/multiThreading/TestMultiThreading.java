package day39_collections.multiThreading;

public class TestMultiThreading {

    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);
        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);


        thread1.start(); // Every time when the start method is being called from the threats to run,
        // run methods will be executed concurrently. (at the same time, coexist), if you want thread to be executed at same time
        // you have to use start method, otherwise if you use run() method can not be executed at same time and only run method is executed

/*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();

 */

        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
