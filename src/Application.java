public class Application {
    public static void main(String[] args) {
        Director director = new Director("Виктор");
        School school = new School("89", director);

        Teacher teacher1 = new Teacher("Виктория Викторовна", "русский язык", 50);
        Teacher teacher2 = new Teacher("Антон Иванович", "физика", 70);

        Student student1 = new Student("Иван", "информатика");
        Student student2 = new Student("Сергей", "русский язык");

        school.addStudents(student1);
        school.addStudents(student2);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        school.day();
    }
}
