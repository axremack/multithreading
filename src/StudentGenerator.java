import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator {
    public static ArrayList<Student> list;

    public StudentGenerator() {
        this.list = new ArrayList<>();
    }

    public static ArrayList<Student> generate(int nb) {
        for (int i = 0; i < nb; i++) {
            Random rand = new Random();
            int random_id = rand.nextInt(nb);
            Student s = new Student(random_id);
            list.add(s);
        }

        return list;
    }
}
