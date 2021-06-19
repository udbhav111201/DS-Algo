package abstRaction;

public class MainClass {
   public static void Repair( Car car) {
	   System.out.println("Car is repaired");
   }
	public static void main(String[] args) {
		Audi mine = new Audi();
		Repair(mine);
		mine.accelerate();
		
		
		
		

	}

}
