package com.lohika.javaclub.stat;

import java.util.List;

public class ConsoleStatWriter implements StatisticWriter {

    @Override
    public void writeStatistic(List<String> stat) {
        System.out.println("Writing git stats to console");
    }
}
