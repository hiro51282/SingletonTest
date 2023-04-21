package VolatileSingleton;
public class VolatileSingleton {
    private static volatile VolatileSingleton instance;

    private VolatileSingleton() {}

    public static VolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileSingleton.class) {
                if (instance == null) {
                    instance = new VolatileSingleton();
                }
            }
        }
        return instance;
    }
}