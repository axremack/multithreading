import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class StudentGenerator implements Runnable {
    public static Vector<Student> list = new Vector<>();

    public void generate(int nb) {
        for (int i = 0; i < nb; i++) {
            Random rand = new Random();
            int random_id = rand.nextInt(nb);
            Student s = new Student(random_id);
            list.add(s);
        }
    }

    @Override
    public void run() {
        int nb = 50000;
        generate(nb);
    }
}
