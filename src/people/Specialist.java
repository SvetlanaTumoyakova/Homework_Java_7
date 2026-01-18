package people;

public class Specialist extends Graduate {
    private int diploma_rating;

     public  Specialist() {
     }

    public Specialist(String lastname, String firstname, int age, String specialty, String group, int rating, String topic, int diploma_rating) {
        super(lastname, firstname, age, specialty, group, rating, topic);
        this.diploma_rating = diploma_rating;
    }

    public Specialist(Graduate graduate,  int diploma_rating ) {
        super(graduate);
        this.diploma_rating = diploma_rating;
    }

    @Override
    public String toString() {
        return super.toString() +  " " + diploma_rating;
    }
}
