package oops;

class cat {
	int legs, eyes;
	String breed, color;
	
 	public void eat() {
		System.out.println("cat is eating the food");
	}}
class dog { int legs, eyes;
            String breed , color;
             void walk() {System.out.println("dog is walking");
}}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat mireLla = new cat();
		dog joSeph = new dog();
		
		mireLla.legs = 4;
		mireLla.eyes=2;
		mireLla.eat();
		
		joSeph.legs = 4;
		joSeph.eyes=2;
		joSeph.breed= "labrador";
		joSeph.walk();
		System.out.println("my dog joseph is of breed called "+ joSeph.breed);
		System.out.println("my cat has "+ mireLla.eyes+" eyes and "+mireLla.legs+" legs");
	}

}
