import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (instance == null) {
            try {
                // 模拟实例化需要较长时间
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new ClassicSingleton();
        }
        return instance;
    }

    private void print() {
        System.out.println(instance);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            executorService.execute(() -> {
                ClassicSingleton classicSingleton = getInstance();
                classicSingleton.print();
            });
        }
        executorService.shutdown();
    }
}
