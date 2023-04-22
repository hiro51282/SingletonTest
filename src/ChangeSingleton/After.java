package ChangeSingleton;

/**
 * After
 */
public class After {

    private static After instance = null;
    private String name = "";

    private After() {
        name = "";
    }

    public static synchronized After getInstance() {
        if (instance == null) {
            instance = new After();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}