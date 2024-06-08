package org.example.part3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Master {

    public static void main(String[] args) {

        var counter = new Node();

        Thread t1 = new Thread(() -> IntStream.range(0, 10).forEach(i -> counter.log()), "T1");
        Thread t2 = new Thread(() -> IntStream.range(0, 10).forEach(i -> counter.log()), "T2");
        Thread t3 = new Thread(() -> IntStream.range(0, 10).forEach(i -> counter.log()), "T3");

        try {

            Arrays.asList(t1, t2, t3).forEach(Thread::start);

            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter.debug();
    }
}
