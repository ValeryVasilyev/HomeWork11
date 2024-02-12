import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScalableThreadPool {
    ExecutorService executorService;

    ScalableThreadPool(int min, int max) {
         this.executorService = Executors.newFixedThreadPool(max);
    }
}
