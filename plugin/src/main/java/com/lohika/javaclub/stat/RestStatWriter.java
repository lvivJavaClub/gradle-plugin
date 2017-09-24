package com.lohika.javaclub.stat;

import java.util.List;

public class RestStatWriter implements StatisticWriter {
    @Override
    public void writeStatistic(List<String> stat) {
        System.err.println("This call trigger remote server via http to post commiters data");
    }
}
