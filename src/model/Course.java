package model;

import utils.Constants;

import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseName;
    private int courseRoom;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String courseName, int courseRoom, Teacher teacher, ArrayList<Student> students) {
        this.courseId = (int) Math.floor(Math.random()*(Constants.MAX_ID-Constants.MIN_ID+1)+Constants.MIN_ID);
        this.courseName = courseName;
        this.courseRoom = courseRoom;
        this.teacher = teacher;
        this.students = students;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(int courseRoom) {
        this.courseRoom = courseRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
