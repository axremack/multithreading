import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator implements Runnable {
    public static ArrayList<Student> list = new ArrayList<>();

    public void generate(int nb) {
        for (int i = 0; i < nb; i++) {
            Random rand = new Random();
            int random_id = rand.nextInt(nb);
            Student s = new Student(random_id);

            synchronized (this) {
                list.add(s);
            }
        }
    }

    @Override
    public void run() {
        int nb = 50000;
        generate(nb);
    }
}
