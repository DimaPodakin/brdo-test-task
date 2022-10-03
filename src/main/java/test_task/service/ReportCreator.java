package test_task.service;

import java.util.List;
import test_task.model.Comment;

public interface ReportCreator {
    String createReport(List<Comment> comments);
}
