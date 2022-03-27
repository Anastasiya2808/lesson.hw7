public class School {
    private String name;

    private Director director;
    private Teacher [] teachers = new Teacher[2];
    private Student [] students = new Student[5];

    public String getName() {
        return name;
    }

    public School (String name, Director director){
        this.name = name;
        this.director = director;
    }
    public void day (){
        director.startLessons();
        for (Teacher t: teachers) {
            for (Student s: students){
                if ((s != null && t != null) && (t.getSubject().equals(s.getSubject()))){
                    t.know(s);
                }
            }
        }
        director.endLessons();
    }
    public void addStudents (Student student){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }

    public void addTeacher (Teacher teacher){
        for (int i = 0; i < teachers.length; i++){
            if (teachers[i] == null){
                teachers[i] = teacher;
            }
        }
    }

}
