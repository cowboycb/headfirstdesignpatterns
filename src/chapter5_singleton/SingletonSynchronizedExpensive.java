package chapter5_singleton;

/**
 * Synchronizing all method is expensive.
 */
public class SingletonSynchronizedExpensive {
    private static SingletonSynchronizedExpensive instance;

    public static synchronized SingletonSynchronizedExpensive getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedExpensive();
        }
        return instance;
    }
}
