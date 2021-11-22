import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator {
    ArrayList<Student> list;

    public StudentGenerator() {
        this.list = new ArrayList<Student>();
    }

    public ArrayList<Student> generate(int nb) {
        for (int i = 0; i < nb; i++) {
            Random rand = new Random();
            int upperbound = 150000;
            int random_id = rand.nextInt(upperbound);
            Student s = new Student(random_id);
            list.add(s);
        }

        return list;
    }
}
