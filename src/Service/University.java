package Service;

import model.*;

import java.util.ArrayList;

public interface University {
    void addTeacher(Teacher teacher);
    void addStudent(Student student);
    void addCourse(Course course);
    void findAllStudents();
    void findAllTeachers();
    void findAllCourses();
    void findAllCourseByStudentId(Integer studentId);
    void getInfoCourse(Integer courseId);
    void addStudentToCourse(Student student,int courseId);
    Integer getCourse(Integer courseId);
    Teacher getTeacher(Integer teacherId);
    TeacherPartTime createPartTimeTeacher(String teacherName, int hoursPerWeek);
    TeacherFullTime createFullTimeTeacher(String teacherName, int experience);
    Student createNewStudent(String name, int age);
    Course createCourse(String courseName, int courseRoom, Teacher teacher, ArrayList<Integer> studentsIds);

}
