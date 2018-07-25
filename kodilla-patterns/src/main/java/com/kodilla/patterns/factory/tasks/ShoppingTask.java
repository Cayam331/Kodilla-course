package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Tasks{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
