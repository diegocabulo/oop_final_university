package model;

import utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Course {
    private int courseId;
    private String courseName;
    private int courseRoom;
    private Teacher teacher;
    private ArrayList<Integer> studentsId;

    public Course(int courseId, String courseName, int courseRoom, Teacher teacher, ArrayList<Integer> studentsId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseRoom = courseRoom;
        this.teacher = teacher;
        this.studentsId = studentsId;
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


    public ArrayList<Integer> getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(ArrayList<Integer> studentsId) {
        this.studentsId = studentsId;
    }



    @Override
    public String toString(){
        String listStringId = studentsId.stream().map(Object::toString).collect(Collectors.joining(", "));
        return "Course id: "+courseId+ "\n" +"Course Name: " +courseName + "\n"+ "Course Room: "+courseRoom + "\n"
                +"Teacher Id: "+ teacher.getTeacherId() + "\n"+"Teacher Name: "+ teacher.getName() + "\n"+"Students Id: "+ listStringId + "\n";
    }

}
