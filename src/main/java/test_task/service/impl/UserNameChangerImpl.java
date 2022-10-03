package test_task.service.impl;

import java.util.List;
import test_task.model.Comment;
import test_task.model.User;
import test_task.service.UserNameChanger;

public class UserNameChangerImpl implements UserNameChanger {
    @Override
    public void updateUsername(List<Comment> comments) {
        comments.forEach(comment -> upperFirstLatter(comment.getUser()));
    }

    private void upperFirstLatter(User user) {
        String username = user.getUsername();
        String updatedName = username.substring(0, 1).toUpperCase()
                + username.substring(1);
        user.setUsername(updatedName);
    }
}
