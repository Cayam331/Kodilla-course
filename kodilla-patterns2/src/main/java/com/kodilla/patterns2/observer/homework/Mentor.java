package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName){
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(mentorName + ": New task to check: " + tasksQueue.getName() +
                "\n" + " (total: " + tasksQueue.getTaskList().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
