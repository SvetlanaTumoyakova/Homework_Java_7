import people.Graduate;
import people.Student;
import people.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Капустин", "Роман", 18, "КБ", "КБ-31", 5);
        System.out.print(student1);
        Student student2 = new Student("Звездочкин", "Борис", 32, "РПО", "ITЗ-21", 5);
        System.out.print(student2);
        Teacher teacher1 = new Teacher("Ягодкин", "Матвей", 38, "Data Science и аналитика", 116);
        System.out.print(teacher1);
        Graduate graduate1 = new Graduate("Пуговкин", "Сергей", 19, "РПО", "IT-41", 5, "Многофакторная аутентификация с биометрией и аппаратными токенами");
        System.out.print(graduate1);
        System.out.println();
    }
}
