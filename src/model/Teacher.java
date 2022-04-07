package model;

import utils.Constants;

public class Teacher {
    private int teacherId;
    private String name;
    private int salary;


    public Teacher(int teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.salary= Constants.BASE_SALARY;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
