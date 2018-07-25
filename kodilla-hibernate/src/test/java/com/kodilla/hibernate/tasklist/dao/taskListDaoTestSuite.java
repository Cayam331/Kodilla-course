package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.taskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class taskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        taskList taskList1 = new taskList("To do List", "List with things to do");

        //When
        taskListDao.save(taskList1);
        List<taskList> resultTaskList = taskListDao.findByListName("To do List");
        int id = taskList1.getId();

        //Then
        Assert.assertEquals(resultTaskList.get(0).getListName(), "To do List");
        taskListDao.delete(id);
    }
}
