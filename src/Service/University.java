package Service;

import model.Course;
import model.Student;
import model.Teacher;

import java.util.ArrayList;

public interface University {
    void addTeacher(Teacher teacher);
    void addStudent(Student student);
    void addCourse(Course course);
    void listAllTeachers();
    void listAllCourses();
    Integer getCourse(Integer courseId);
    void getInfoCourse(Integer courseId);
    void addStudentToCourse(Student student,int courseId);
    Student createNewStudent(int studentId, String name, int age);
    void createCourse(int id, String courseName, int courseRoom, Teacher teacher, ArrayList<Integer> studentsIds);
    void getAllCourseByStudentId(Integer studentId);
}
