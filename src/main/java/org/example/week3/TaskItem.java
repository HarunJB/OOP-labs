package org.example.week3;

public class TaskItem {
    public int taskId;
    public String taskDescription;
    public Status status;

    public TaskItem(int taskId, String taskDescription, Status status) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.status = status;
    }
}

enum Status {
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}
