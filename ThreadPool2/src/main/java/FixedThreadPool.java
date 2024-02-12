import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    ExecutorService executors;

    FixedThreadPool(){
        this.executors = Executors.newFixedThreadPool(3);
    }
}
