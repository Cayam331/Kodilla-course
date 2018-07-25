package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final List<String> tasks;

    @Override
    public String toString() {
        return "TaskList " +
                "tasks=" + tasks + " ";
    }

    public TaskList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task){
        tasks.add(task);
    }
}
