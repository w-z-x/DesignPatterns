import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    try {
                        // 模拟实例化需要较长时间
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    private void print() {
        System.out.println(instance);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = getInstance();
                doubleCheckedLockingSingleton.print();
            });
        }
        executorService.shutdown();
    }
}
