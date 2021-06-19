package loops;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("print the number of rows you want");
		int n= sc.nextInt();
		for(int i = 1; i<=n;i++) {
		if(i==1||i==n) {for(int j =1;j<=i;j++)System.out.print("* ");
		 System.out.println();}
		else {System.out.print("* ");
		       for(int j=1;j<=i-2;j++)System.out.print("  ");
		       System.out.println("* ");
		     }
		}
		}
		

	}


