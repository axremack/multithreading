import java.util.Random;

public class StudentGenerator {
    private Student s;

    public StudentGenerator() {
        Random rand = new Random();
        int upperbound = 100;
        int random_id = rand.nextInt(upperbound);
        this.s = new Student(random_id);
    }

    public Student getStudent() {
        return s;
    }
}
