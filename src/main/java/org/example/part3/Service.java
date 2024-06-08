package org.example.part3;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class Service {

    private int counter = 0;

    private final List<String> logList = new LinkedList<>();
}
