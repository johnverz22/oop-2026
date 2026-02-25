import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        Student s = new Student();
        s.setFirstName("Eliza");
        System.out.println(s.getFirstName());

        Student s2 = new Student("Owen", "Anchola", LocalDate.of(2007, Month.OCTOBER, 10), "Male", 25934, "BSCS", 1);
        System.out.println(s2.getInfo());

        Person p = new Person("John", "Doe", LocalDate.of(2005, Month.APRIL, 5), "Male");
        System.out.println(p.getInfo());
    }
    
}
