package oops.singleton;

public class singleton {

	public static void main(String[] args) {
	 AppConfig obj = AppConfig.GetInstance("ram");  // as AppConfig is a static object, we can directly access it from class 
	 AppConfig obj2 = AppConfig.GetInstance("shyam");  // without making an object
     System.out.println(obj.name);
	}

}
