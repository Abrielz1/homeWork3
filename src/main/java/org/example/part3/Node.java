package org.example.part3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@AllArgsConstructor
@NoArgsConstructor
public class Node {

    private int counter = 0;
    private final List<String> logList = new LinkedList<>();

    ReentrantLock lock1 = new ReentrantLock();

    ReentrantLock lock2 = new ReentrantLock();

   public void log() {
       lock1.lock();
       ++counter;
       lock2.lock();
       logList.add(Thread.currentThread().getName());
       lock1.unlock();
       lock2.unlock();
    }

    void debug() {
        logList.forEach(System.out::println);
        System.out.println("thread is:" + counter);
    }
}
