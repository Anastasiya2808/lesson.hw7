import base.Record;
import base.Subject;

public class Teacher extends Subject {
    public int navik;

    public Teacher (String name, String subject, int navik){
        super(subject, name);
        this.navik = navik;
    }

    public void know (Student student){
        student.knowleges(navik);
        System.out.println("учитель преподает " + getSubject());
    }
}
