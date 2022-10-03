package test_task.service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import test_task.model.Comment;

public interface InsertTime {
    void insertTime(List<Comment> comments);
}
