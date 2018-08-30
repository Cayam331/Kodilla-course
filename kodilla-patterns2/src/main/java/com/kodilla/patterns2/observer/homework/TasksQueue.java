package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable{
    private final List<Observer> observers;
    private final List<String> taskList;
    private final String studentName;

    public TasksQueue(String studentName) {
        this.observers = new ArrayList<>();
        this.taskList = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task){
        taskList.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public String getName() {
        return studentName;
    }
}
