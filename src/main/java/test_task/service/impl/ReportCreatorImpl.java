package test_task.service.impl;

import java.util.List;
import test_task.model.Comment;
import test_task.service.ReportCreator;

public class ReportCreatorImpl implements ReportCreator {
    @Override
    public String createReport(List<Comment> comments) {
        StringBuilder builder = new StringBuilder("id | body | postId | username | updatedAt");
        builder.append(System.lineSeparator());
        for (Comment comment : comments) {
            builder.append(comment.getReportString());
        }
        return builder.toString();
    }
}
