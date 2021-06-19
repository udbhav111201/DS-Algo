package oops.singleton;

public class AppConfig {
	static String name = "hari";
private AppConfig() {

}

    private static AppConfig obj = null;
    public static AppConfig GetInstance(String nam)
    {if (obj==null) obj = new AppConfig();
       name = name.concat(nam);
    return obj;
    }
}
