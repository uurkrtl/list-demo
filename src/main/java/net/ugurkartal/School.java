package net.ugurkartal;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        this.students.add(student);
    }

    public void printStudents(){
        for (Student student : this.students){
            System.out.printf("First name: %s, LastName: %s, Id: %d\n", student.firstName, student.lastName, student.id);
        }
    }

    public Student findById (int id){
        for (Student student : students){
            if (student.id == id){
                return student;
            }
        }
        return null;
    }

    public List<Course> retrieveAllCourses (int studentId){
        Student student = this.findById(studentId);
        List<Course> courses = student.courses;
        return courses;
    }
}