package EnunSingleton;
public enum EnumSingleton {
    INSTANCE;
    private String testStr = "";

    public void doSomething() {
        // シングルトンインスタンスを利用して何らかの処理を行う
        // この場合、EnumSingleton.INSTANCE がシングルトンインスタンスを表す
        System.out.println("スレッド" + Thread.currentThread().getName() + " : " + this.hashCode());
        testStr=Thread.currentThread().getName() + " : " + this.hashCode();
    }
    public String getTestStr() {
        return testStr;
    }

}