package Service;

import model.Course;
import model.Student;
import model.Teacher;

public interface University {
    void addTeacher(Teacher teacher);
    void addStudent(Student student);
    void addCourse(Course course);
    void listAllTeachers();
    void listAllCourses();
    void createNewStudent();
    void addStudentToCourse();
    void createCourse();
    void searchAllCourseByStudentId();
}
