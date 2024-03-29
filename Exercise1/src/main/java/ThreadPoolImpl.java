import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolImpl implements ThreadPool {
    ExecutorService executorService;


    public void start() {
        executorService = Executors.newSingleThreadExecutor();
    }

    public void execute(Runnable runnable) {
        executorService.execute(runnable);
    }
}
