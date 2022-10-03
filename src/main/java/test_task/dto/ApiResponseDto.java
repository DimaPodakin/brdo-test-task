package test_task.dto;

import java.util.Arrays;
import test_task.model.Comment;

public class ApiResponseDto {
    private Comment[] comments;

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "ApiResponseDto{"
                + "comments=" + Arrays.toString(comments)
                + '}';
    }
}
