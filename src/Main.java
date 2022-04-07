import Service.University;
import Service.UniversityImpl;
import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UniversityImpl university = new UniversityImpl();
        initializeProgram(university);
        String input = "";
        while (!input.equals("q")){
            System.out.println("******* GLOBANT UNIVERSITY APP!! *******");
            optionsMenu();
            System.out.print("---> ");
            input = scanner.next().toLowerCase();
            if(input.equals("1")){
                listTeachers(university);
            }
            if(input.equals("2")){
                getAllCourses(university);
            }
            if(input.equals("3")){
                createNewStudent(university);
            }
            if(input.equals("4")){
                createNewCourse(university);
            }
            if(input.equals("5")){
                searchAllCoursesByStudent(university);
            }
        }

    }

    private static void initializeProgram(University university){
        Student student1 = university.createNewStudent("student 1", 20);
        Student student2 = university.createNewStudent("student 2", 21);
        Student student3 = university.createNewStudent("student 3", 22);
        Student student4 = university.createNewStudent("student 4", 23);
        Student student5 = university.createNewStudent("student 5", 24);
        Student student6 = university.createNewStudent("student 6", 25);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);

        TeacherPartTime teacherPartTime = university.createPartTimeTeacher("teacher 1", 5);
        TeacherFullTime teacherFullTime = university.createFullTimeTeacher("teacher 2", 10);

        university.addTeacher(teacherFullTime);
        university.addTeacher(teacherPartTime);

        Course course1 = university.createCourse("Course name 1", 1, teacherPartTime,
                new ArrayList<>(Arrays.asList(student1.getStudentId(),student2.getStudentId())));
        Course course2 = university.createCourse("Course name 2", 2, teacherFullTime,
                new ArrayList<>(Arrays.asList(student3.getStudentId(),student4.getStudentId())));
        Course course3 = university.createCourse("Course name 3", 3, teacherPartTime,
                new ArrayList<>(Arrays.asList(student5.getStudentId(),student6.getStudentId())));
        Course course4 = university.createCourse("Course name 4", 4, teacherFullTime,
                new ArrayList<>(Arrays.asList(student2.getStudentId(),student5.getStudentId())));

        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);
        university.addCourse(course4);

    }

    private static void optionsMenu(){
        System.out.println("""
                    Enter\s
                     (1) Get all Teachers information\s
                     (2) Get all Courses\s
                     (3) Create new Student \s
                     (4) Create new Course \s
                     (5) Search all Courses by student id\s
                     (q) to Exit""");
    }

    private static void listTeachers(University university){
        university.findAllTeachers();
    }

    private static void getAllCourses(University university){
        Scanner scanner = new Scanner(System.in);
        university.findAllCourses();
        System.out.print("Type a course id to get more information: ---> ");
        String courseId = scanner.next();
        university.getInfoCourse(Integer.parseInt(courseId));
    }

    private static void createNewStudent(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name: ---> ");
        String studentName = scanner.next();
        System.out.print("How old is the student: ---> ");
        int studentAge = scanner.nextInt();
        Student student = university.createNewStudent(studentName,studentAge);
        university.findAllCourses();
        System.out.print("Enter the course id to add student to course : ---> ");
        int courseId = scanner.nextInt();
        university.addStudentToCourse(student,courseId);
    }

    private static void createNewCourse(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a course name: ---> ");
        String courseName = scanner.next();
        System.out.print("Enter a course Room: ---> ");
        int courseRoom = scanner.nextInt();
        university.findAllTeachers();
        System.out.print("Enter the teacher id to add teacher to course: ---> ");
        int teacherId = scanner.nextInt();
        Teacher teacher = university.getTeacher(teacherId);
        String inputNumber;
        ArrayList<Integer> studentsId = new ArrayList<>();
        university.findAllStudents();
        while (true){
            System.out.print("Enter the Student id to add student to course OR (q) to finish adding: ---> ");
            inputNumber = scanner.next().toLowerCase();
            if(inputNumber.equals("q")){
                break;
            }
            studentsId.add(Integer.parseInt(inputNumber));
        }
        Course course = university.createCourse(courseName,courseRoom,teacher,studentsId);
        university.addCourse(course);
    }

    private static void searchAllCoursesByStudent(University university){
        Scanner scanner = new Scanner(System.in);
        university.findAllStudents();
        System.out.print("Enter a student id name: ---> ");
        int studentId = scanner.nextInt();
        university.findAllCourseByStudentId(studentId);
    }
}
