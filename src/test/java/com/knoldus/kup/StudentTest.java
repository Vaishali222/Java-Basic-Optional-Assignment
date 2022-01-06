package com.knoldus.kup;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class StudentTest extends TestCase {

    Student student;

    @Override
    @Before
    public void setUp() throws Exception {
        student = new Student("Vaishali",1, Optional.of("Java"));
    }

    @Test
    public void testGetName() {
        String expectedName = "Vaishali";
        String actualName = student.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        String expectedName = "Anjali";
        student.setName("Anjali");
        String actualName = student.getName();
        assertTrue(expectedName.equals(actualName));
    }


    @Test
    public void testGetRollNumber() {
        int expectedRollNo = 1;
        int actualRollNo = student.getRollNumber();
        assertEquals(expectedRollNo, actualRollNo);
    }

    @Test
    public void testSetRollNumber() {
        student.setRollNumber(2);
        int expectedRollNo = 2;
        int actualRollNo = student.getRollNumber();
        assertEquals(expectedRollNo, actualRollNo);
    }

    public void testGetSubject() {
        Optional<String> expectedSubject = Optional.of("Java");
        Optional<String> actualSubject = student.getSubject();
        assertEquals(expectedSubject,actualSubject);
    }

    @Test
    public void testSetSubject() {
        student.setSubject(Optional.of("Java"));
        Optional<String> expectedSubject = Optional.of("Java");
        Optional<String> actualSubject = student.getSubject();
        assertEquals(expectedSubject,actualSubject);
    }

    @Test
    public void testToString() {
        String expected = "Student{" +
                "name='" + student.getName() + '\'' +
                ", rollNumber=" + student.getRollNumber() +
                ", subject=" + student.getSubject() +
                '}';
        String actual = student.toString();
        assertEquals(expected,actual);
    }
}