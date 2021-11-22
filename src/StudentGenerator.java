import java.util.Random;

public class StudentGenerator {

    public Student generate() {
        Random rand = new Random();
        int upperbound = 100;
        int random_id = rand.nextInt(upperbound);
        Student s = new Student(random_id);

        return s;
    }
}
