import java.util.ArrayList;

public class Main {
    public static final int NUMBER_OF_THREADS = 3;
    public static final int ITERATIONS = 5;
    public static Thread[] threads = new Thread[NUMBER_OF_THREADS];
    public static StudentGenerator sg_sequential = new StudentGenerator();
    public static StudentGenerator sg_thread = new StudentGenerator();


    public static void main(String[] args) {
        // Sequential generation performance
        long sequential_perf = 0;

        for (int i = 0; i < ITERATIONS; i++) {
            sequential_perf += sequentialGeneration(150000);
        }

        sequential_perf /= ITERATIONS;
        System.out.println("Temps d'éxécution séquentielle moyen : " + (sequential_perf) + " millisecondes.\n");


        // Threaded generation performance
        /*long threaded_perf = 0;

        try {
            for (int i = 0; i < ITERATIONS; i++) {
                threaded_perf += threadedGeneration();
            }

            //threaded_perf /= ITERATIONS;
            System.out.println("Temps d'éxécution multithreadé moyen : " + (threaded_perf) + " millisecondes.\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static long sequentialGeneration(int nb){
        long start_time = System.currentTimeMillis();

        sg_sequential.generate(nb);

        long end_time = System.currentTimeMillis();
        long diff = end_time - start_time;

        return diff;
    }

    public static long threadedGeneration() throws InterruptedException {
        long start_time = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_THREADS; i++){
            threads[i] = new Thread(sg_thread);
            threads[i].start();
        }

        for (int i = 0; i < NUMBER_OF_THREADS; i++){
            threads[i].join();
        }

        long end_time = System.currentTimeMillis();
        long diff = end_time - start_time;

        return diff;
    }
}
