package model;


import utils.Constants;

public class Student {
    private int id;
    private String name;
    private  int age;

    public Student(int id, String name, int age) {
        this.id = (int) Math.floor(Math.random()*(Constants.MAX_ID-Constants.MIN_ID+1)+Constants.MIN_ID);
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
