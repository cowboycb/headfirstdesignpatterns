package chapter5_singleton;

/**
 * Basic implementation of singleton
 */
public class SingletonBasicLazy {

    private static SingletonBasicLazy instance;

    public static SingletonBasicLazy getInstance() {
        if (instance == null) {
            instance = new SingletonBasicLazy();
        }
        return instance;
    }
}
