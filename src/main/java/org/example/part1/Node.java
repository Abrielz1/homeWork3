package org.example.part1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Node {

    private String name;

   private final Service service = new Service();


   public void log() {
      int i = service.getCount().incrementAndGet();
       service.getLogList().add(
             name + " " + i + " " + Thread.currentThread().getName());

    }

    void debug() {
       StringBuffer buffer = new StringBuffer();
       buffer.append(service.getCount().get()

       );
        System.out.println("counter is: " + buffer);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(service.getLogList().getLast());

        System.out.println("thread is:" + stringBuffer);
    }
}
