package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.taskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListDao extends CrudRepository<taskList, Integer> {
    List<taskList> findByListName(String listName);
}
