package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
public class TaskListDaoTestSuite {

    private final static String TODO = "To-Do list";
    private final static String DESCRIPTION = "List of things to do";

    @Autowired
    private TaskListDao taskListDao;

    private List<TaskList> resultList;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskListToDo = new TaskList(TODO,DESCRIPTION);

        //When
        taskListDao.save(taskListToDo);
        String name = taskListToDo.getListName();
        resultList = taskListDao.findByListName(name);

        //Then
        Assertions.assertTrue(resultList.size() == 1);

        //Cleanup
        int id = resultList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
