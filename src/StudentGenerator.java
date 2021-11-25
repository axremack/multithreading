import java.util.ArrayList;
import java.util.Random;

public class StudentGenerator implements Runnable {
    public static ArrayList<ArrayList<Student>> sublistList;

    public StudentGenerator() {
        this.sublistList = new ArrayList<>();
    }

    public void generate(int nb, ArrayList<Student> list) {
        for (int i = 0; i < nb; i++) {
            Random rand = new Random();
            int random_id = rand.nextInt(nb);
            Student s = new Student(random_id);
            list.add(s);
        }
    }

    @Override
    public void run() {
        ArrayList<Student> sublist = new ArrayList<>();
        int nb = 5000;
        generate(nb, sublist);
        sublistList.add(sublist);
    }
}
