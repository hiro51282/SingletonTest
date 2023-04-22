/**
 * 
 * 上記の修正では、以下の変更が行われています。

 * コンストラクタがprivateになり、外部からインスタンスを生成できないようになっています。
 * getInstance()メソッドが追加され、シングルトンインスタンスを取得するために使用されます。
 * instance変数がstaticであり、シングルトンインスタンスを保持するために使用されます。
 * instance変数がprivateであり、外部からアクセスできないようになっています。
 * getName()およびsetName()メソッドは変更されていませんが、今後も使用できます。
 * 修正後のクラスでは、getInstance()メソッドを使用してインスタンスを取得することができます。例えば以下のようにして利用できます。
 * 
 * また、Afterクラスはスレッドセーフです。ただし、getInstance()メソッドがsynchronizedであるため、同時にアクセスされるとパフォーマンスに影響が出る場合があることに注意してください。
 */
package ChangeSingleton;

public class UseChangeSingleton {
    public static void main(String[] args) {
        Before instanceBefore =new Before();
        instanceBefore.setName("exampleBefore");
        System.out.println(instanceBefore.getName());

        After instanceAfter = After.getInstance();
        instanceAfter.setName("exampleAfter");
        System.out.println(instanceAfter.getName());

    }
}
