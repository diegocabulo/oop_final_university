package Service;

import model.Course;
import model.Student;
import model.Teacher;

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
    public void listAllTeachers() {
        System.out.println("TEACHERS IN UNIVERSITY");
        for(Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }

    @Override
    public void listAllCourses() {
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
    public void getInfoCourse(Integer courseId) {
        for(Course course: courses){
            if(courseId.equals(course.getCourseId())){
                System.out.println("Course info");
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
    public Student createNewStudent(int studentId, String name, int age) {
        return new Student(studentId, name,age);
    }

    @Override
    public void createCourse(int id, String courseName, int courseRoom, Teacher teacher, ArrayList<Integer> studentsIds) {
        courses.add(new Course(id,courseName,courseRoom,teacher,studentsIds));
    }


    @Override
    public void getAllCourseByStudentId(Integer studentId) {
        for(Course course:courses){
            for(Integer student: course.getStudentsId()){
                if(studentId.equals(student)){
                    System.out.println("Course id: "+course.getCourseId()+ "\n"
                            +"Course Name: " +course.getCourseName() + "\n"+"Course Room: " +course.getCourseRoom() + "\n");
                }
            }
        }
        System.out.println("The student is not assign in any course");

    }
}
