import java.util.ArrayList;

public class Main {
    public static final int NUMBER_OF_THREADS = 3;
    public static final int ITERATIONS = 10;
    public static Thread[] threads = new Thread[NUMBER_OF_THREADS];
    public static ArrayList<Student> listMain = new ArrayList<>();

    public static void main(String[] args) {
        // Sequential generation performance
        sequentialGenerationPerf();

        // Threaded generation performance
        threadedGenerationPerf();

        // Sequential saving to disk and measuring impact on other treatments
        try {
            sequentialSavingPerf();
            sequentialGenerationPerf();
            threadedGenerationPerf();
        } catch (Exception e) {
            System.err.println("Error : threaded writing in file failed");
        }
    }

    public static void sequentialGenerationPerf() {
        long sequential_perf = 0;

        for (int i = 0; i < ITERATIONS; i++) {
            sequential_perf += sequentialGeneration(15000);
        }

        sequential_perf /= ITERATIONS;
        System.out.println("Temps d'éxécution séquentielle moyen : " + (sequential_perf) + " millisecondes.\n");
    }

    public static long sequentialGeneration(int nb){
        StudentGenerator sg_sequential = new StudentGenerator();
        long start_time = System.currentTimeMillis();

        sg_sequential.generate(nb, listMain);

        long end_time = System.currentTimeMillis();
        long diff = end_time - start_time;

        return diff;
    }

    public static void threadedGenerationPerf() {
        long threaded_perf = 0;

        try {
            for (int i = 0; i < ITERATIONS; i++) {
                threaded_perf += threadedGeneration();
            }
            threaded_perf /= ITERATIONS;
            System.out.println("Temps d'éxécution multithreadé moyen : " + (threaded_perf) + " millisecondes.\n");
        } catch (Exception e) {
            System.err.println("Error : threaded execution failed");
        }
    }

    public static long threadedGeneration() throws InterruptedException {
        StudentGenerator sg_thread = new StudentGenerator();
        long start_time = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_THREADS; i++){
            threads[i] = new Thread(sg_thread);
            threads[i].start();
        }

        for (int i = 0; i < NUMBER_OF_THREADS; i++){
            threads[i].join();
        }

        for (ArrayList<Student> sublist : sg_thread.sublistList){
            listMain.addAll(sublist);
        }

        long end_time = System.currentTimeMillis();
        long diff = end_time - start_time;

        return diff;
    }


    public static void sequentialSavingPerf() {
        long threaded_perf = 0;

        try {
            threaded_perf = sequentialSaving();
            System.out.println("Temps de sauvegarde séquentiel : " + (threaded_perf) + " millisecondes.\n");
        } catch (Exception e) {
            System.err.println("Error : sequential saving failed");
        }
    }

    public static long sequentialSaving() throws Exception {
        StudentWriter sw = new StudentWriter("resources/student_serialized.txt");
        long start_time = System.currentTimeMillis();

        sw.saveListSerialized(listMain);

        long end_time = System.currentTimeMillis();
        long diff = end_time - start_time;

        return diff;
    }

}
