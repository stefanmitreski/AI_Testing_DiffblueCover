package com.sampleservice.demo.service;

import com.sampleservice.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {StudentServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceImplTest {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    /**
     * Method under test: {@link StudentServiceImpl#delete(Student)}
     */
    @Test
    public void testDelete() {
        // Arrange
        // TODO: Populate arranged inputs
        StudentServiceImpl studentServiceImpl = this.studentServiceImpl;
        Student student = null;

        // Act
        studentServiceImpl.delete(student);

        // Assert
        // TODO: Add assertions on result
    }
}

