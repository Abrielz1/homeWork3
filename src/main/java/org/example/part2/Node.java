package org.example.part2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Node {

    private String name;

   private final Service service = new Service();


   public void log() {
      int i = service.getCount().incrementAndGet();
       service.getLogList().add(i + " " + Thread.currentThread().getName());
    }

    void debug() {
        service.getLogList().forEach(System.out::println);
        System.out.println("thread is:" + service.getCount().get());
    }
}
