package portfolio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testAddTaskList() {
        //Given
        Board project = prepareTestData();

        //When

        //Then
        assertEquals(3, project.getTaskLists().size());
    }

    private Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Jane Doe");
        User user3 = new User("developer2", "Mike Johnson");
        User user4 = new User("developer3", "Sarah Williams");

        //tasks
        Task task1 = new Task("Microservice for taking temperature", "Write and test the microservice taking\n" +
                "the temperature from external service", user1, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(30));
        Task task2 = new Task("Webpage design", "Design a responsive and user-friendly webpage",
                user2,
                user3,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Database optimization", "Optimize the performance of the database system",
                user3,
                user4,
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(10));
        Task task4 = new Task("Software testing", "Test the software for bugs and errors",
                user4,
                user1,
                LocalDate.now().minusDays(15),
                LocalDate.now().plusDays(20));
        Task task5 = new Task("Marketing campaign", "Create and execute a successful marketing campaign",
                user1,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(35));
        Task task6 = new Task("Mobile app development", "Develop a mobile app for iOS and Android platforms",
                user2,
                user3,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To Do");

        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);

        TaskList taskListInProgress = new TaskList("In Progress");

        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);

        TaskList taskListDone = new TaskList("Done");

        taskListDone.addTask(task6);

        //boards
        Board project = new Board("Project Weather Prediction");

        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

        return project;
    }

    @Test
    void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();
        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());
        //Then
        //assertEquals(3,tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(3).getAssignedUser());
        assertEquals(user, tasks.get(4).getAssignedUser());
    }
    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To Do"));
        undoneTasks.add(new TaskList("In Progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());
        //Then
        assertEquals(1,tasks.size());
        assertEquals("Webpage design", tasks.get(1).getTitle());
    }

}
