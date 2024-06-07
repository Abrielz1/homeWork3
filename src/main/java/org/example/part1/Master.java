package org.example.part1;

import java.util.ArrayList;
import java.util.List;

public class Master {
    public static void main(String[] args) {
        Node node = new Node();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            threads.add(new Thread(node::log));
            threads.add(new Thread(node::debug));
        }

        threads.forEach(Thread::start);

    }
}
