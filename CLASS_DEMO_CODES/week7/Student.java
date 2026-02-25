import java.time.LocalDate;

public class Student extends Person {
    private int studentID;
    private String course;
    private int year;

    public Student(){}

    public Student(String firstName, String lastName, LocalDate birthDate, String gender, int studentID, String course,
            int year) {
            // super.setFirstName(firstName);
            // super.setLastName(lastName);
            super(firstName, lastName, birthDate, gender);
            this.course = course;
            this.studentID = studentID;
            this.year = year;
        
    }
    public Student(int studentID, String course, int year) {
        this.studentID = studentID;
        this.course = course;
        this.year = year;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override   //annotation
    public String getInfo(){
        return "Student: " + super.getFirstName() + " " + super.getLastName();
    }

    //Overloading
    public String getInfo(String format){
        if(format.equals("U"))
            return getInfo().toUpperCase();

        return getInfo();
    }
    
}
