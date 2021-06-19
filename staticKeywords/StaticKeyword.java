package staticKeywords;

import staticKeywords.Student.Teacher;
import staticKeywords.Student.friend;

public class StaticKeyword {
	static {System.out.println("Hi i am here");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher tom=  new Student.Teacher();  // teacher is a static class, syntax new A.B()
		Student rob = new Student();
		friend tim =  rob.new friend();
		//friend is a non-static class, syntax objA.new B()
        System.out.println("What ever happens , i will alwayse be after all the static blocks");
	}
 static {System.out.println("i know you can't find me");}
          //static blocks are there
}
