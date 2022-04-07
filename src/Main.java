import Service.UniversityImpl;
import model.Course;
import model.Student;
import model.TeacherFullTime;
import model.TeacherPartTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UniversityImpl university = new UniversityImpl();
        Student student = new Student(1,"student", 24);
        TeacherPartTime teacherPartTime = new TeacherPartTime(1,"teacher 1", 5);
        Course course = new Course(1,"Course 1", 2, teacherPartTime,
                new ArrayList<>(Arrays.asList(student.getStudentId(),2,3)));

        Course course1 = new Course(2,"Course 2", 3, teacherPartTime,
                new ArrayList<>(Arrays.asList(student.getStudentId(),4,5)));

        university.addCourse(course);
        university.addCourse(course1);

        university.getAllCourseByStudentId(6);
    }
}
