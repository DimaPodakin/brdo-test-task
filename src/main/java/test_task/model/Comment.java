package test_task.model;

public class Comment {
    private Long id;
    private String body;
    private Long postId;
    private User user;
    private String updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Comment{"
                + "id=" + id
                + ", body='" + body + '\''
                + ", postId=" + postId
                + ", user=" + user
                + ", updatedAt='" + updatedAt + '\''
                + '}';
    }

    public String getReportString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id)
                .append(" | ")
                .append(body)
                .append(" | ")
                .append(postId)
                .append(" | ")
                .append(user.getUsername())
                .append(" | ")
                .append(updatedAt)
                .append(System.lineSeparator());
        return builder.toString();
    }
}
