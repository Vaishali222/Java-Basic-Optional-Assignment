package com.knoldus.kup;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class classRoom {
    /**
     *  Room Id.
     */
    private String roomId;
    /**
     *  To associate the students.
     */
    private Optional<List<Student>> studentList;
    /**
     *  ClassRoom constructor to initialize the member variables.
     * @param classRoomId
     * @param classStudents
     */
    public classRoom(final String classRoomId,
                     final Optional<List<Student>> classStudents) {
        this.roomId = classRoomId;
        this.studentList = classStudents;
    }
    /**
     * Method to find the students associated
     * with a room that have no subjects associated.
     * @return students list
     */
    public List<Student> getStudentsWithoutSubject() {
        List<Student> withoutSubject =  studentList.get().stream()
                .filter(student -> student
                        .getSubject().equals(Optional.empty()))
                .collect(Collectors.toList());
        return withoutSubject;
    }
    /**
     * Method to find the unique subject list
     * of the students associated with a room
     * that has given roomID.
     * @param classRoomId
     * @return Optional list of distinct subjects.
     */
    public List<Optional<String>> getDistinctSubjectsByRoomId(
            final String classRoomId) {
        if (!classRoomId.equals(roomId)) {
            return null;
        }
        List<Optional<String>> distinctSubject = studentList.get()
                .stream()
                .filter(student -> student.getSubject().isPresent())
                .map(student -> student.getSubject()).distinct()
                .collect(Collectors.toList());
        return distinctSubject;
    }
    /**
     * Method to print "Hello Students" if a room has students associated.
     * @return a string.
     */
    public String hasStudents() {
        if (studentList.isPresent()) {
            return "hello Student";
        }
        return "";
    }
    /**
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }
    /**
     * @param classRoomId
     */
    public void setRoomId(final String classRoomId) {
        this.roomId = classRoomId;
    }
    /**
     * @return studentList
     */
    public Optional<List<Student>> getStudentList() {
        return studentList;
    }
    /**
     * @param classStudentList
     */
    public void setStudentList(final Optional<List<Student>> classStudentList) {
        this.studentList = classStudentList;
    }
    /**
     * @return Class Room details
     */
    @Override
    public String toString() {
        return "ClassRoom{"
                + "roomId='" + roomId + '\''
                + ", studentList=" + studentList
                + '}';
    }
}

