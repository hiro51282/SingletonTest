package VolatileSingleton;
public class UseVolatileSingletons {
    public static void main(String[] args) {
        threadSafeSingletonCall();
        threadSafeSingletonThereadCall();
    }

    private static void threadSafeSingletonCall() {
        System.out.println("Call:VolatileSingleton");
        VolatileSingleton singleton1 = VolatileSingleton.getInstance();
        VolatileSingleton singleton2 = VolatileSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton1とsingleton2は同じインスタンスです");
        } else {
            System.out.println("singleton1とsingleton2は異なるインスタンスです");
        }
    }

    private static void threadSafeSingletonThereadCall() {
        System.out.println("Call:VolatileSingletonThereadCall");
        Runnable task = () -> {
            VolatileSingleton singleton = VolatileSingleton.getInstance();
            System.out.println("スレッド" + Thread.currentThread().getName() + " : " + singleton.hashCode());
        };

        // 10個のスレッドを作成して、それぞれでVolatileSingletonのインスタンスを取得する
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }


}