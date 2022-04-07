package model;

import utils.Constants;

public class Teacher {
    private final int id;
    private String name;
    private int salary;


    public Teacher(String name) {
        this.id = (int) Math.floor(Math.random()*(Constants.MAX_ID-Constants.MIN_ID+1)+Constants.MIN_ID);
        this.name = name;
        this.salary = 0;
    }

    public int getId() {
        return id;
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
