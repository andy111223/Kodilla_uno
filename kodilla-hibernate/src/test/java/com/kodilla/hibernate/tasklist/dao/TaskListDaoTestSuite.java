package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class TaskListDaoTestSuite {

    private final static String TODO = "To-Do list";
    private final static String DESCRIPTION = "List of things to do";
    private static final String LISTNAME = "TASKLIST";

    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;

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
    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task(DESCRIPTION,30);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(120), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(230), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME,"ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        assertNotEquals(0,id);
        //Cleanup
        taskListDao.deleteById(id);
    }
    @Test
    void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate",3);
        Task task2 = new Task("Test: Practice Named Queries",6);
        Task task3 = new Task("Test: Study native queries",7);
        Task task4 = new Task("Test: Make some tests",13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5),false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10),false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15),false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList(TODO,"Todo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWithDurationLongerThan(6);

        try {
            assertEquals(1, longTasks.size());
            assertEquals(3, shortTasks.size());
            assertEquals(3, enoughTimeTasks.size());
            assertEquals(2,durationLongerThanTasks.size());
        } finally {
            //Cleanup
            taskListDao.deleteById(id);
        }
    }
}
