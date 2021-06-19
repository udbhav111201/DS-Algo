package loops;
import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {System.out.println("print the number to be incresed"); n = sc.nextInt();
System.out.println(++n);
	} while (n != 0);

}}
