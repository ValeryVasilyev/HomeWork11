public class Main {
    public static void main(String[] args) {
            ThreadPoolImpl threadPool1 = new ThreadPoolImpl();
            Task task1 = new Task();

            threadPool1.start();
            threadPool1.execute(task1);
    }
}
