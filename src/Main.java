import Service.UniversityImpl;
import model.Student;
import model.TeacherFullTime;
import model.TeacherPartTime;

public class Main {
    public static void main(String[] args) {
        UniversityImpl university = new UniversityImpl();
        TeacherPartTime teacherPartTime = new TeacherPartTime("diego", 5);

        university.addTeacher(teacherPartTime);
        university.addTeacher(new TeacherFullTime("Teacher 2", 9));

        university.listAllTeachers();
    }
}
