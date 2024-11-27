package thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int numTasks = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numTasks);

        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < numTasks; i++) {
            Callable<Integer> task = new MyTask(i);
            Future<Integer> future = executor.submit(task);
            futures.add(future);
        }

        for (Future<Integer> future : futures) {
            try {
                int result = future.get();
                System.out.println("Task " + result + " completed.");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

