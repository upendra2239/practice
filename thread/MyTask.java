package thread;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {
    private int id;

    public MyTask(int id) {
        this.id = id;
    }

    @Override
    public Integer call() {
        System.out.println("Task " + id + " is running on thread " + Thread.currentThread().getName());
        return id;
    }
}
