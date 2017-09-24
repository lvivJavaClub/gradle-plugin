package com.lohika.javaclub;

import com.lohika.javaclub.stat.StatisticWriter;

import java.util.ArrayList;
import java.util.List;

public class GitServiceImpl implements GitService {

    private List<StatisticWriter> statisticWriters = new ArrayList<>();

    @Override
    public List<String> getCommiters() {
        return null;
    }

    @Override
    public void showStatistic() {
        statisticWriters.forEach(statisticWriter -> statisticWriter.writeStatistic(getCommiters()));
    }

    @Override
    public void registerWriter(StatisticWriter statisticWriter) {
        statisticWriters.add(statisticWriter);
    }
}
