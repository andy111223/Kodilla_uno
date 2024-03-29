package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";

//    @AfterEach
//    void cleanUp() {
//        taskDao.deleteAll();
//    }
    @Autowired
    private TaskDao taskDao;

    @Test
    void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION,7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }
    @Test
    @Transactional //ensures the transaction roll-back in the db
    void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION,7);
        taskDao.save(task);
        int duration = task.getDuration();
        //When
        List<Task> readTasks = taskDao.findByDuration(duration);
        //Then
        assertEquals(1,readTasks.size());
        //Cleanup
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
        //When
        taskDao.save(task);
        int id = task.getId();
        //Then
        assertNotEquals(0,id);
        //Cleanup
        taskDao.deleteById(id);
    }
}
