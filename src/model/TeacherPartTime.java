package model;

import utils.Constants;

public class TeacherPartTime extends Teacher{
    private int hoursPerWeek;


    public TeacherPartTime( String name, int hoursPerWeek) {
        super(name);
        this.hoursPerWeek = hoursPerWeek;
        int totalSalary = Constants.BASE_SALARY * hoursPerWeek;
        this.setSalary(totalSalary);
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString(){
        return "id: "+getId()+ "\n" +"Name: " +getName() + "\n"+ "Salary: "+getSalary() + "\n" +"hoursPerWeek: "+ hoursPerWeek+ "\n";
    }
}
