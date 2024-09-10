package code;

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
     * Create new code.Teacher object via parameterized constructor
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

    /**
     *
     * @return the name of the teacher.
     */
    public String getName(){
        return teacher_name;
    }

    /**
     *
     * @return the current age of the teacher.
     */
    public int getAge(){
        return age;
    }

    /**
     *
     * @return the current salary of the teacher.
     */
    public double getSalary(){
        return salary;
    }

    /**
     *
     * @return the gender of the teacher.
     */
    public String getGender(){
        return gender;
    }

    /**
     *
     * @return the current address of the teacher.
     */
    public String getAddress(){
        return address;
    }

    /**
     *
     * @param age set the new age
     */
    public void setAge(int age){
        this.age=age;
    }

    /**
     *
     * @param salary set the updated salary of the teacher
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     *
     * @param address update the current address of the teacher
     */
    public void setAddress(String address){
        this.address=address;
    }

}
