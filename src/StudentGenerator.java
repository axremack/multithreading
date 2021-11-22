import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator implements Runnable {
    public static ArrayList<Student> list = new ArrayList<>();
    public static final ArrayList[] threads =  new ArrayList[Main.NUMBER_OF_THREADS];

    public static ArrayList<Student> generate(int nb) {
        for (int i = 0; i < nb; i++) {
            Random rand = new Random();
            int random_id = rand.nextInt(nb);
            Student s = new Student(random_id);
            list.add(s);
        }

        return list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
