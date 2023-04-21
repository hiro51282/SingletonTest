package EnunSingleton;
public class UseEnumSingleton {
    public static void main(String[] args) {
        ThreadSafeClass runnable = new ThreadSafeClass();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}