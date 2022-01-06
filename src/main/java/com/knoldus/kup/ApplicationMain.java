package com.knoldus.kup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ApplicationMain {
    /**
     * main() method for the application.
     * @param args
     */
    public static void main(final String[] args) {
        final int student1RollNo = 1;
        final int student2RollNo = 2;
        final int student3RollNo = 3;
        final int student4RollNo = 4;
        final int student5RollNo = 5;
        final int student6RollNo = 6;
        final int student7RollNo = 7;

        Student student1 = new Student(
                "Vaishali", student1RollNo, Optional.of("Java"));
        Student student2 = new Student(
                "Ayesha", student2RollNo, Optional.empty());
        Student student3 = new Student(
                "Anjali", student3RollNo, Optional.empty());
        Student student4 = new Student(
                "Sonam", student4RollNo, Optional.of("Spring"));
        Student student5 = new Student(
                "Ritika", student5RollNo, Optional.of("React"));
        Student student6 = new Student(
                "Tiya", student6RollNo, Optional.of("Java"));
        Student student7 = new Student(
                "Himali", student7RollNo, Optional.of("Spring"));

//      * Creating student list.
        Optional<List<Student>> studentList = Optional
                .of(Arrays.asList(student1, student2, student3, student1));
//      * Creating a student list.
        Optional<List<Student>> studentList2 = Optional
                .of(Arrays.asList(student4, student5, student6,
                        student7));
//      * Creating class room list.
        List<classRoom> classRooms = new ArrayList<>();
        classRooms.add(new classRoom("A1", studentList));
        classRooms.add(new classRoom("xyz", studentList2));
        classRooms.add(new classRoom("A2", Optional.empty()));

//          Printing hello students if given room having students.
        String resultString = classRooms.get(1).hasStudents();
        System.out.println(resultString);

//       Finding students without subjects.
        List<Student> studentsWithoutSubject = classRooms
                .get(0).getStudentsWithoutSubject();
        System.out.println("\nStudent List Without subject: ");
        studentsWithoutSubject.stream().forEach(System.out::println);

//       Finding distinct subjects of students associated with room id "xyz".
        List<Optional<String>> subjectsList = classRooms.get(1)
                .getDistinctSubjectsByRoomId("xyz");
        System.out.println("\nDistinct Subject List of ClassRoom xyz: ");
        subjectsList.stream().forEach(System.out::println);
    }
}
