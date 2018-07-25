package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DrivingTask = "DrivingTask";
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";

    public final Tasks createTask(final String taskClass) {
        switch (taskClass) {
            case DrivingTask:
                return new DrivingTask("Pick up children", "Warsaw", "car");
            case ShoppingTask:
                return new ShoppingTask("Dinner ingredigents", "salad", 3);
            case PaintingTask:
                return new PaintingTask("House painting", "red", "bedroom, kitchen");
            default:
                return null;
        }
    }
}
