package com.example.studentcourse.repository;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private List<Student> students = new ArrayList<>();

    public void initializeSampleStudents() {
        Course course1 = new Course(1, "Introduction to Programming", "COMP101");
        Course course2 = new Course(2, "Data Structures and Algorithms", "COMP201");
        Course course3 = new Course(3, "Calculus I", "MATH101");
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        Student student1 = new Student(1, "John", "Doe", "john.doe@example.com", "Computer Science", 3.75, courses);
        Student student2 = new Student(2, "Jane", "Smith", "jane.smith@example.com", "Engineering", 3.85, new ArrayList<>());
        Student student3 = new Student(3, "Alice", "Johnson", "alice.johnson@example.com", "Mathematics", 3.60, new ArrayList<>());

        // Add the sample students to the list
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        List<Student> students = getAllStudents();
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(int id, Student student) {
        students = students.stream().map((studentOfStream) -> {
            if (studentOfStream.getId() == id) {
                studentOfStream = student;
                return studentOfStream;
            }
            return student;
        }).toList();
        return student;

    }

    public Student deleteStudent(int id) {
        List<Student> students = getAllStudents();
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return student;
            }
        }
        return null;

    }

    public List<Student> getStudentsByMajor(String major) {
        List<Student> students = getAllStudents();
        List<Student> returnStudents = new ArrayList<Student>();
        for (Student st : students) {
            if (st.getMajor().equals(major)) {
                returnStudents.add(st);
            }
        }
        return returnStudents;
    }

    public List<Course> getCoursesByStudentId(int studentId) {
        return getStudentById(studentId).getCoursesTaken();
    }
}
