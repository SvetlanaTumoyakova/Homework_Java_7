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

    public Student( Human human,
                    String specialty, String group, int rating) {
        super(human);
        this.specialty = specialty;
        this.group = group;
        this.rating = rating;
    }

    public Student(Student other){
        super(other);
        this.specialty = other.specialty;
        this.group = other.group;
        this.rating = other.rating;
    }

    @Override
    public String toString() {
        return  super.toString()+ " " +  specialty + " " + group + " " + rating;
    }
}
