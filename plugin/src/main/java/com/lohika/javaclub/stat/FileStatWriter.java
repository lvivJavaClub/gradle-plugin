package com.lohika.javaclub.stat;

import java.io.File;
import java.util.List;

public class FileStatWriter implements StatisticWriter {

    private final File outputFile;

    public FileStatWriter(String fileName) {
        this.outputFile = new File(fileName);
    }

    @Override
    public void writeStatistic(List<String> stat) {
        System.err.println("Write into outputFile");
//TODO add implementation
    }
}
