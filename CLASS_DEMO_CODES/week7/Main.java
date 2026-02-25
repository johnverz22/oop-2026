import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(1234, "BSIT", 1);
        Student s2 = new Student("Sochima", "Obiefule", "Male", LocalDate.of(2009, Month.JUNE, 4), "098473646374", "declan@hotmail.com", 251053, "BSIT", 1);
        System.out.println(s2.toString());

        System.out.println(s2.getInfo());
    }
}
