package model;

import utils.Constants;

public class TeacherFullTime extends Teacher{
    private int experience;

    public TeacherFullTime(String name, int experience) {
        super(name);
        this.experience = experience;
        double totalSalary = Constants.BASE_SALARY * experience * Constants.MULTIPLIER_EXP_YEARS;
        this.setSalary((int) totalSalary);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString(){
        return "id: "+getId()+ "\n" +"Name: " +getName() + "\n"+ "Salary: "+getSalary() + "\n" +"Experience: "+ experience + "\n";
    }


}
