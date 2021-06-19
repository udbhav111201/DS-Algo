package oops;
 import java.util.Scanner;
 
 class dogg {
	 int legs, eyes;
	 String breed;}
 
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
//       int c = sc.nextInt();
//       int d = sc.nextInt();
//       swap(c,d);
//       System.out.println("Value of a and b after using swap are "+ c+" "+d);
       
       dogg husky = new dogg();
        husky.legs = 4;
        husky.eyes = 2;
        dogg poodle = new dogg();
        poodle.legs = 3;
        poodle.eyes = 3;
        swap(husky,poodle);
        System.out.println("no of legs of husky are "+ husky.legs+" and no of eyes of poodle are "+poodle.eyes);
       
       
	}
	
	static void swap (int a, int b)
	{ int temp = a;
	   a = b;
	   b = temp;}
	
	static void swap (dogg a, dogg b) {
		dogg temp = new dogg();
		temp = a;
		a = b;
		b = temp;}
	}
	

