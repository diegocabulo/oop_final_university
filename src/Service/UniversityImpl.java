package Service;

import model.*;
import java.util.ArrayList;
import java.util.Objects;

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
    public void findAllStudents() {
        System.out.println("STUDENTS IN UNIVERSITY");
        for(Student student: students){
            System.out.println(student);
        }
    }

    @Override
    public void findAllTeachers() {
        System.out.println("TEACHERS IN UNIVERSITY");
        for(Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }

    @Override
    public void findAllCourses() {
        System.out.println("COURSES IN UNIVERSITY");
        for(Course course: courses){
            System.out.println("Course id: "+course.getCourseId()+ "\n" +"Course Name: " +course.getCourseName() + "\n");
        }
    }

    @Override
    public Integer getCourse(Integer courseId) {
        for (Course course:courses){
            if(courseId.equals(course.getCourseId())){
                return courses.indexOf(course);
            }
        }
        return null;
    }

    @Override
    public Teacher getTeacher(Integer teacherId) {
        for (Teacher teacher:teachers){
            if(teacherId.equals(teacher.getTeacherId())){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void getInfoCourse(Integer courseId) {
        for(Course course: courses){
            if(courseId.equals(course.getCourseId())){
                System.out.println("<<<---Course info--->>>");
                System.out.println(course);
            }
        }
    }

    @Override
    public void addStudentToCourse(Student student, int courseId) {
        Integer indexCourse = getCourse(courseId);
        if(Objects.nonNull(indexCourse)){
            Course course = courses.get(indexCourse);
            ArrayList<Integer> newStudentsId = course.getStudentsId();
            newStudentsId.add(student.getStudentId());
            course.setStudentsId(newStudentsId);
        }
    }


    @Override
    public Student createNewStudent(String name, int age) {
        return new Student(name,age);
    }

    @Override
    public Course createCourse(String courseName, int courseRoom, Teacher teacher, ArrayList<Integer> studentsIds) {
        return new  Course(courseName,courseRoom,teacher,studentsIds);
    }


    @Override
    public void findAllCourseByStudentId(Integer studentId) {
        boolean foundStudent = false;
        for(Course course:courses){
            for(Integer student: course.getStudentsId()){
                if(studentId.equals(student)){
                    foundStudent = true;
                    System.out.println("Course id: "+course.getCourseId()+ "\n"
                            +"Course Name: " +course.getCourseName() + "\n"+"Course Room: " +course.getCourseRoom() + "\n");
                }
            }
        }
        if(!foundStudent){
            System.out.println("The student is not assign in any course");
        }


    }

    @Override
    public TeacherPartTime createPartTimeTeacher(String teacherName, int hoursPerWeek) {
        return new TeacherPartTime(teacherName,hoursPerWeek);
    }

    @Override
    public TeacherFullTime createFullTimeTeacher(String teacherName, int experience) {
        return new TeacherFullTime(teacherName,experience);
    }
}
