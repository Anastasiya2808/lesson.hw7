import base.Record;

public class Director extends Record {
    public Director (String name){
        super(name);
    }

    public Director (int age){
        super(age);
    }

    public void startLessons(){
        System.out.println("Начало урока 9:00 ч.");
    }

    public void endLessons(){
        System.out.println("Конец урока 15:00 ч.");
    }
}
