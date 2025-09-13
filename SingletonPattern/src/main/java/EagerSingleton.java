import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    private void print() {
        System.out.println(INSTANCE);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                EagerSingleton eagerSingleton = getInstance();
                eagerSingleton.print();
            });
        }
        executorService.shutdown();
    }
}
