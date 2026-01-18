package people;

public class Student extends Human {
    private String specialty, group;
    private int rating;

    public Student(){
    }

    public Student(String lastname, String firstname, int age,
                   String specialty, String group, int rating) {
        super(lastname, firstname, age);
        this.specialty = specialty;
        this.group = group;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  super.toString()+ " " +  specialty + " " + group + " " + rating;
    }
}
