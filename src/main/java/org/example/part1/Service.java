package org.example.part1;

import lombok.Data;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class Service {

    private AtomicInteger count = new AtomicInteger(0);

    private final Deque<String> logList = new LinkedBlockingDeque<>();
}
