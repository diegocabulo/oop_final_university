package model;
import utils.Constants;


public class Student {
    private int studentId;
    private String name;
    private  int age;

    public Student(String name, int age) {
        this.studentId = (int)Math.floor(Math.random()*(Constants.MAX_ID-Constants.MIN_ID+1)+Constants.MIN_ID);
        this.name = name;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student id: "+studentId+ "\n" + "Student name: "+name+ "\n";
    }
}
