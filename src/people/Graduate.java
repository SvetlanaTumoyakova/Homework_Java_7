package people;

public class Graduate extends Student {
    private String topic;

    public Graduate(String lastname, String firstname, int age,
                    String specialty, String group, int rating,
                    String topic) {
        super(lastname, firstname, age, specialty, group, rating);
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + " " + topic;
    }
}
