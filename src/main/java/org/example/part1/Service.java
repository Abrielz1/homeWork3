package org.example.part1;

import lombok.Data;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class Service {

    private AtomicInteger count = new AtomicInteger(0);

    private final List<String> logList = new LinkedList<>();
}
