package code;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher Dinesh = new Teacher(101, "Mr. Dinesh Kumar", 35, 37890.00, "Male", "Ambala City, Haryana");
        Teacher Clark = new Teacher(102, "Mrs. Clark", 30, 27000.00, "Female", "Sector 73, Mohali" );
        Teacher Mark = new Teacher(103, "Mr. Mark", 47, 35000.00, "Male", "St. street Road, Mumbai");

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(Dinesh);
        teacherList.add(Clark);
        teacherList.add(Mark);

        Student Madhav = new Student(1, "Madhav", "Male", 99, 70000, "Chandigarh");
        Student Vasudev = new Student(2, "Vasudev", "Male", 98, 70000, "Dhakoli");
        List<Student> studentList=new ArrayList<>();
        studentList.add(Madhav);
        studentList.add(Vasudev);

        School TexasSchool = new School(teacherList, studentList);
        System.out.println("Texas School has earned " + TexasSchool.getTotalMoneyEarned() + " dollars.");

        Madhav.payFees(7000);
        System.out.println("Texas School has earned " + TexasSchool.getTotalMoneyEarned() + " dollars.");
    }
}
