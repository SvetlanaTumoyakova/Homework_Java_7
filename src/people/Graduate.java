package people;

public class Graduate extends Student {
    private String topic;

    public Graduate() {
    }

    public Graduate(String lastname, String firstname, int age,
                    String specialty, String group, int rating,
                    String topic) {
        super(lastname, firstname, age, specialty, group, rating);
        this.topic = topic;
    }

    public Graduate(Student student,  String topic) {
        super(student);
        this.topic = topic;
    }

    public Graduate(Graduate other) {
        super(other);
        this.topic = other.topic;
    }

    @Override
    public String toString() {
        return super.toString() + " " + topic;
    }
}
