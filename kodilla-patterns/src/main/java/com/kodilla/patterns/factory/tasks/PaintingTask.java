package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Tasks{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = false;
    }

    public void executeTask() {
        System.out.println("Executing task: " + this.taskName);
        this.isExecuted = true;
    }

    public boolean isTaskExecuted() {
        return this.isExecuted;
    }

    public String getTaskName(){
        return this.taskName;
    }
}
