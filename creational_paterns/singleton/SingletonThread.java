package creational_paterns.singleton;

public class SingletonThread {
    private static volatile SingletonThread instance;

    private SingletonThread() {
    }

    public static synchronized SingletonThread getInstance() {
        if (instance == null) {
            instance = new SingletonThread();
        }
        return instance;
    }
}
