package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		 dog moolchand = new dog();
		 Pet p = moolchand;
		 Animals a = moolchand;
		 System.out.println(a.name);
		 System.out.println(p.name);
		 System.out.println(moolchand.name);
		 
		 moolchand.walk();
		 p.walk();
		 a.walk();
	}

}
