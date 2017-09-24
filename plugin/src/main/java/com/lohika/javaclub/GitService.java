package com.lohika.javaclub;

import com.lohika.javaclub.stat.StatisticWriter;

import java.util.List;

public interface GitService {

    List<String> getCommiters();

    void showStatistic();

    void registerWriter(StatisticWriter statisticWriter);
}
