package net.ugurkartal;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ugur", "Kartal", 1));
        students.add(new Student("Ingo", "Becker", 2));
        students.add(new Student("Reebal", "Sami", 3));
        students.add(new Student("Aaron", "Becher", 4));

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java", "Instructor-1" , "201"));
        courses.add(new Course("C", "Instructor-2" , "202"));
        courses.add(new Course("Python", "Instructor-3" , "203"));
        courses.add(new Course("C sharp", "Instructor-4" , "204"));

        students.get(0).addCourse(courses.get(0));
        students.get(0).addCourse(courses.get(2));
        students.get(1).addCourse(courses.get(3));
        students.get(2).addCourse(courses.get(1));

        School school = new School();
        school.addStudent(students.get(0));
        school.addStudent(students.get(1));
        school.addStudent(students.get(2));
        school.addStudent(students.get(3));

        school.printStudents();

        school.deleteStudentById(2);
        school.printStudents();

        System.out.println(school.findById(1));

        System.out.println(school.retrieveAllCourses(1));
        System.out.println(school.retrieveAllCourses(3));
    }
}