package loops;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = 1;
		for(int i= n;i>0;i--)
		{ factorial *= i;}
		System.out.println("factorial of "+n +" is "+ factorial );
		
		

	}

}
