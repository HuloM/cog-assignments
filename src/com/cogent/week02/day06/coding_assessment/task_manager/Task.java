package com.cogent.week02.day06.coding_assessment.task_manager;

public class Task {
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "Task{ " +
                "taskId= " + taskId +
                ", taskName= '" + taskName + '\'' +
                " }";
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    private int taskId;
    private String taskName;
}
