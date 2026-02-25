import java.time.LocalDate;

public class Student extends Person{
    private int studentID;
    private String course;
    private int year;

    public Student(){

    }

    public Student(String firstName, String lastName, String gender, LocalDate birthDate, String phone, String email, int studentID, String course, int year){
        //super.setFirstName(firstName);
        super(firstName, lastName, gender, birthDate, phone, email);
        this.studentID = studentID;
        this.course = course;
        this.year = year;
    }




    public Student(int studentID, String course, int year){
        this.studentID = studentID;
        this.course = course;
        this.year = year;
    }

    public String toString(){
        return "Class: Student \n Full Name: " + super.getFirstName() + " " + super.getLastName();
    }

    
    public String getInfo(){
        return "Student " + super.getFirstName() + " " + super.getLastName();
    }

    public String getInfo(String format){
        if(format.equals("U"))
            return getInfo().toUpperCase();
        
        return getInfo();
    }

}
