package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Tasks{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = false;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public boolean isTaskExecuted() {
        return this.isExecuted;
    }

    public void executeTask() {
        System.out.println("Executing task: " + this.taskName);
        this.isExecuted = true;
    }
}
