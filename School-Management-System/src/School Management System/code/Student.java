package code;

/****************
 * This class is responsible for keeping track of student's names, id, fees, grade
 * **************/
public class Student {
    private int university_id;
    private String student_name;
    private String gender;
    private int grade;
    private int amount_paid;
    private String address;

    /**
     *
     * @param university_id id for the student: unique
     * @param student_name name of the student.
     * @param gender gender of the student.
     * @param grade grade of the student.
     * @param amount_paid fees paid by the student. (70000rs per year)
     * @param address address of the student.
     */
    public Student(int university_id, String student_name, String gender, int grade, int amount_paid, String address){
        this.university_id=university_id;
        this.student_name=student_name;
        this.gender=gender;
        this.grade=grade;
        this.amount_paid=0;
        this.address=address;
    }

    // Not going to alter student's name, id, gender.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Used to update the student's fees.
     * @param amount_paid new fees to be paid
     */
    public void payFees(int amount_paid){
        this.amount_paid+=amount_paid;

    }

    /**
     * Used to update the student's address.
     * @param address updated address
     */
    public void updateAddress(String address){
        this.address=address;
    }

    /**
     *
     * @return the university id
     */
    public int getUniversity_id() {
        return university_id;
    }

    /**
     *
     * @return the student name
     */
    public String getStudent_name() {
        return student_name;
    }

    /**
     *
     * @return the student's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return student's grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return amound paid by the student as fees
     */
    public int getAmount_paid() {
        return amount_paid;
    }

    /**
     *
     * @return student's current address
     */
    public String getAddress() {
        return address;
    }
}
