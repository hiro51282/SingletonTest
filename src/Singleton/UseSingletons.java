package Singleton;
public class UseSingletons {
    public static void main(String[] args) {
        nomalSingletonCall();
        threadSafeSingletonCall();
        threadSafeSingletonThereadCall();
        threadSafeSingletonNotThereadCall();
    }

    private static void nomalSingletonCall() {
        System.out.println("Call:Singleton");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton1とsingleton2は同じインスタンスです");
        } else {
            System.out.println("singleton1とsingleton2は異なるインスタンスです");
        }

    }

    private static void threadSafeSingletonCall() {
        System.out.println("Call:ThreadSafeSingleton");
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton1とsingleton2は同じインスタンスです");
        } else {
            System.out.println("singleton1とsingleton2は異なるインスタンスです");
        }
    }

    private static void threadSafeSingletonThereadCall() {
        System.out.println("Call:threadSafeSingletonThereadCall");
        Runnable task = () -> {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println("スレッド" + Thread.currentThread().getName() + " : " + singleton.hashCode());
        };

        // 10個のスレッドを作成して、それぞれでThreadSafeSingletonのインスタンスを取得する
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }

    private static void threadSafeSingletonNotThereadCall() {
        System.out.println("Call:threadSafeSingletonNotThereadCall");
        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println("スレッド" + Thread.currentThread().getName() + " : " + singleton.hashCode());
        };

        // 10個のスレッドを作成して、それぞれでThreadSafeSingletonのインスタンスを取得する
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }

}