package chapter5_singleton;

/**
 * Eager implementation of singleton
 * If the application always uses the instance, this method can be used.
 */
public class SingletonEagerly {

    private static SingletonEagerly instance = new SingletonEagerly();

    public static SingletonEagerly getInstance() {
        return instance;
    }
}
