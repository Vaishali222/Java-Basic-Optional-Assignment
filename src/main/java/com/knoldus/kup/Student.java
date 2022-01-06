package com.knoldus.kup;

import java.util.Optional;

public class Student {
    /**
     * Student's name.
     */
    private String name;
    /**
     * Student's roll number.
     */
    private int rollNumber;
    /**
     * Student's subject.
     */
    private Optional<String> subject;
    /**
     * @param studentName
     * @param studentRollNumber
     * @param studentSubject
     */
    public Student(final String studentName, final int studentRollNumber,
            final Optional<String> studentSubject) {
        this.name = studentName;
        this.rollNumber = studentRollNumber;
        this.subject = studentSubject;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * @param studentName
     */
    public void setName(final String studentName) {
        this.name = studentName;
    }
    /**
     * @return rollNumber
     */
    public int getRollNumber() {
        return rollNumber;
    }
    /**
     * @param studentRollNumber
     */
    public void setRollNumber(final int studentRollNumber) {
        this.rollNumber = studentRollNumber;
    }
    /**
     * @return subject
     */
    public Optional<String> getSubject() {
        return subject;
    }
    /**
     * @param studentSubject
     */
    public void setSubject(final Optional<String> studentSubject) {
        this.subject = studentSubject;
    }

    /**
     * @return student details
     */
    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", rollNumber=" + rollNumber
                + ", subject=" + subject
                + '}';
    }
}
