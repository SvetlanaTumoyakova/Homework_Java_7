package people;

public class Teacher extends Human{
    private String speciality;
    private int experience;

    public Teacher(String firstname, String lastname, int age, String speciality, int experience) {
        super(firstname, lastname, age);
        this.speciality = speciality;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + " " + speciality + " " + experience;
    }
}
