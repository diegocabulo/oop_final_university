package Service;

import model.Course;
import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class UniversityImpl implements University{

    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Teacher> teachers = new ArrayList<>();
    private final ArrayList<Course> courses = new ArrayList<>();


    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);

    }

    @Override
    public void listAllTeachers() {
        for(Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }

    @Override
    public void listAllCourses() {

    }

    @Override
    public void createNewStudent() {

    }

    @Override
    public void addStudentToCourse() {

    }

    @Override
    public void createCourse() {

    }

    @Override
    public void searchAllCourseByStudentId() {

    }
}
