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


    ReentrantLock lock = new ReentrantLock();

   public void log() {
       try {
           lock.lock();
          int i = counter++;
           logList.add(i + " " + Thread.currentThread().getName());
      } finally {
        lock.unlock();
      }
    }

    void debug() {
        logList.forEach(System.out::println);
        System.out.println("thread is:" + counter);
    }
}
