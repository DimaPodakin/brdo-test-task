package test_task.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import test_task.model.Comment;
import test_task.service.InsertTime;

public class InsertTimeImpl implements InsertTime {
    private static final DateTimeFormatter TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Override
    public void insertTime(List<Comment> comments) {
        comments.forEach(comment -> comment.setUpdatedAt(LocalDateTime.now()
                .format(TIME_FORMATTER)));
    }
}
