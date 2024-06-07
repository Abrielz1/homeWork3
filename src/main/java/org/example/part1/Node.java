package org.example.part1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Node extends Thread {

    private String name;

   private final Service service = new Service();


   public void log() {
       service.getCount().get();
       service.getLogList().add(
               Thread.currentThread().getName());

    }

    void debug() {
       StringBuffer buffer = new StringBuffer();
       buffer.append(service.getCount().incrementAndGet()

       );
        System.out.println("000 " + buffer);
        StringBuffer stringBuffer = new StringBuffer();
        buffer.append(service.getLogList().getLast());

        System.out.println("111 " + stringBuffer);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            this.log();
            this.debug();
        }
    }
}
