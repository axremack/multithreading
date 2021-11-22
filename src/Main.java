import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Testing student generation
        StudentGenerator sg = new StudentGenerator();
        ArrayList<Student> list = StudentGenerator.generate(20);
        for (Student s : list) {
            s.print();
        }

        // Sequential generation of 150000 students
        long seq_time = sequentialGeneration(150000);
        System.out.println("Temps d'éxécution : " + (seq_time / 1e9) + " secondes.");


    }

    public static long sequentialGeneration(int nb){
        long start_time = System.nanoTime();

        ArrayList<Student> list = StudentGenerator.generate(nb);

        long end_time = System.nanoTime();
        long diff = end_time - start_time;

        return diff;
    }
}
