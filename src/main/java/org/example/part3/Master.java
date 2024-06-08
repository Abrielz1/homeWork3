package org.example.part3;

import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Master {

    public static void main(String[] args) {

        Node counter = new Node();

        var t1 = new Thread(() -> IntStream.range(0, 10).forEach(i -> counter.log()), "T1");
        var t2 = new Thread(() -> IntStream.range(0, 10).forEach(i -> counter.log()), "T2");
        var t3 = new Thread(() -> IntStream.range(0, 10).forEach(i -> counter.log()), "T3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter.debug();
    }
}
