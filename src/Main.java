import java.util.ArrayList;

public class Main {
    public static final int NUMBER_OF_THREADS = 3;
    public static Thread[] threads = new Thread[NUMBER_OF_THREADS];

    public static void main(String[] args) {
        // Testing student generation
        /*StudentGenerator sg = new StudentGenerator();
        ArrayList<Student> list = StudentGenerator.generate(20);
        for (Student s : list) {
            s.print();
        }*/

        // Sequential generation of 150000 students
        long seq_time = sequentialGeneration(150000);
        System.out.println("Temps d'éxécution : " + (seq_time / 1e9) + " secondes.");

        // Threaded generation of 150000 students
        try {
            long thread_time = threadedGeneration();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static long sequentialGeneration(int nb){
        long start_time = System.nanoTime();

        ArrayList<Student> list = StudentGenerator.generate(nb);

        long end_time = System.nanoTime();
        long diff = end_time - start_time;

        return diff;
    }

    public static long threadedGeneration() throws InterruptedException {
        for (int i = 0; i < NUMBER_OF_THREADS; i++){
            threads[i] = new Thread(new StudentGenerator());
            threads[i].start();
        }

        for (int i = 0; i < NUMBER_OF_THREADS; i++){
            System.out.println(i);
            threads[i].join();
        }


        return 1;
    }
}
