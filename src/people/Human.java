package people;

public class Human {
    private String lastname, firstname;
    private int age;

    public Human() {
    }

    public Human(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" + lastname + " " + firstname + " " + age;
    }
}
