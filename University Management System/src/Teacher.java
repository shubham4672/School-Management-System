/****************
 * This class is responsible for storing teaching staff's information
 * like teacher's id, name, age, salary, gender, address.
 * **************/
public class Teacher {
    private int teacher_id;
    private String teacher_name;
    private int age;
    private double salary;
    private String gender;
    private String address;

    /**
     * Create new Teacher object via parameterized constructor
     * @param teacher_id every teacher's unique id
     * @param teacher_name teacher's name
     * @param age teacher's age
     * @param salary teacher's salary
     * @param gender teacher's gender
     * @param address teacher's address
     */

    public Teacher(int teacher_id, String teacher_name, int age, double salary, String gender, String address ){
        this.teacher_id=teacher_id;
        this.teacher_name=teacher_name;
        this.age=age;
        this.salary=salary;
        this.gender=gender;
        this.address=address;
    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getTeacher_id(){
        return teacher_id;
    }
    public String getName(){
        return teacher_name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }


}
