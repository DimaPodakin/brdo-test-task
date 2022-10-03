package test_task.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import test_task.service.ReportWriterToFile;

public class ReportWriterToFileImpl implements ReportWriterToFile {
    @Override
    public void write(String path, String report) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(report);
        } catch (IOException e) {
            throw new RuntimeException("Cannot create or write data to file", e);
        }
    }
}
