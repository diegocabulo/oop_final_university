package Service;

import model.*;

import java.util.ArrayList;

public interface University {
    void addTeacher(Teacher teacher);
    void addStudent(Student student);
    void addCourse(Course course);
    void listAllStudents();
    void listAllTeachers();
    void listAllCourses();
    Integer getCourse(Integer courseId);
    Teacher getTeacher(Integer teacherId);
    void getInfoCourse(Integer courseId);
    void addStudentToCourse(Student student,int courseId);
    Student createNewStudent(String name, int age);
    Course createCourse(String courseName, int courseRoom, Teacher teacher, ArrayList<Integer> studentsIds);
    void findAllCourseByStudentId(Integer studentId);
    TeacherPartTime createPartTimeTeacher(String teacherName, int hoursPerWeek);
    TeacherFullTime createFullTimeTeacher(String teacherName, int experience);
}
