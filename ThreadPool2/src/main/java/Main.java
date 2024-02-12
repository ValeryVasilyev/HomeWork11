public class Main {
    public static void main(String[] args) {
        FixedThreadPool fixedThreadPool = new FixedThreadPool(); // Пул из трёх ExecutorService

        ScalableThreadPool scalableThreadPool = new ScalableThreadPool(0, 3);
    }
}
