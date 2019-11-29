package chapter5_singleton;

/**
 * First checking to see if an instance is created, and if not, THEN synchronize.
 */
public class SingletonDoubleChecked {
    /**
     * volatile; ensures that multiple threads handle the "instance" variable correctly when it is being initialized.
     */
    private volatile static SingletonDoubleChecked instance;


    public static synchronized SingletonDoubleChecked getInstance() {
        if (instance == null) { // check for an instance and if there isn^t one, enter synchronized block.
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) { // Once in the synchronize block checking again if it is null
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
