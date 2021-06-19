package encapsulations;

public class Student {

	 private int age;
	 private String name;

	 
	  public int getage() {
		  return age;
	  }
	  public void setage( int age) {
		  if (age>= 20) {System.out.println("you are to old to be student");}else 
           this.age = age;}}
