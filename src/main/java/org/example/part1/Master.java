package org.example.part1;

import java.util.ArrayList;
import java.util.List;

public class Master {
    public static void main(String[] args) {
        Node node = new Node("log");
        node.start();

    }
}
//threads.add(new Thread(node::log));
//            threads.add(new Thread(node::debug));