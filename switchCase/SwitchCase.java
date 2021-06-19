package switchCase;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int weekOfDay = sc.nextInt();
	    
	    switch(weekOfDay) {
	    case 1:
	    case 2:
	    	System.out.println("i am on leave");
	    case 3:
	    	System.out.println("today i am really busy");
	    	break;
	    case 4:
	    	System.out.println("today is wednesday");
	    	break;
	    	default : System.out.println("I dont know what day it is");
	    	break;
	}
	}
}
