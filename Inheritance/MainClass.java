package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Teacher Reena = new Teacher();
   Reena.eat();
   Person p = Reena;
   Teacher x = (Teacher) p;
   Person pro = new Person();
   Teacher hub = new Teacher();   
   System.out.println(p instanceof Teacher );
   System.out.println(p instanceof Person);
   System.out.println(pro instanceof Teacher);
   System.out.println(Reena instanceof Person);
   System.out.println(hub instanceof Person);
	}

}
