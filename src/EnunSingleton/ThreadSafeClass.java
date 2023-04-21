package EnunSingleton;
public class ThreadSafeClass implements Runnable {
    private EnumSingleton singleton;

    public ThreadSafeClass() {
        singleton = EnumSingleton.INSTANCE;
    }

    public void run() {
        // スレッドからシングルトンインスタンスを利用して何らかの処理を行う
        singleton.doSomething();
        System.out.println(singleton.getTestStr());

    }
}
