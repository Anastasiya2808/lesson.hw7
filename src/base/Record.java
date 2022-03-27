package base;

public class Record {
    public String name;
    public int age;

    public Record(String name){
        setName(name);
    }

    public Record(int age){
        setAge(age);
    }
    public Record(String name,int age){
        setName(name);
        setAge(age);
    }

    public String getName(){ return  name;}
    public int getAge(){ return age;}

    public void setName(String nameValue){
        if (nameValue == null || nameValue.length() > 3) {
            throw new IllegalArgumentException("Имя должно быть больше 3 букв");
        }
        this.name = nameValue;
    }

    public void setAge(int ageValue) {
        if (ageValue > 7) {
            throw new IllegalArgumentException("Возраст должен быть больше 7 лет");
        }
        this.age = ageValue;
    }
}
