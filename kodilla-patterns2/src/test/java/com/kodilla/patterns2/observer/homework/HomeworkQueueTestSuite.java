package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    void testUpdate() {
        //Given
        HomeworkQueue javaHomework = new JavaQueue();
        HomeworkQueue pythonHomework = new PythonQueue();

        Mentor mrWisdom = new Mentor(" Mr Wisdom");
        Mentor mrsRight = new Mentor("Mrs Right");

        javaHomework.registerObserver(mrWisdom);
        pythonHomework.registerObserver(mrsRight);
        //When
        javaHomework.addTask("Module 1 homework");
        javaHomework.addTask("Module 2 homework");
        javaHomework.addTask("Module 3 homework");
        pythonHomework.addTask("Module 7 homework");
        pythonHomework.addTask("Module 8 homework");
        pythonHomework.addTask("Module 9 homework");
        pythonHomework.addTask("Module 10 homework");
        //Assert
        assertEquals(3, mrWisdom.getUpdateCount());
        assertEquals(4, mrsRight.getUpdateCount());
    }
}
