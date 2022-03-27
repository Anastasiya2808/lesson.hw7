package base;

public class Subject extends Record {
    public String subject;

    public Subject (String subject, String name){
        super(name);
        if (subject == null || subject.length() > 3){
            throw new IllegalArgumentException("Название предмета не менее 3 букв");
        }
        this.subject = subject;
    }

    public String getSubject (){
        return subject;
    }
}
