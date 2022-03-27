import base.Subject;

public class Student extends Subject{
    private int know;

    public Student (String name, String subject){
        super(subject,name);
    }

    public int getKnow() {
        return know;
    }

    public void knowleges (int navik){
        know = know + ((int) (Math.random() * navik));
        System.out.println("Ученик получил навык от предмета" + know);
    }
}
