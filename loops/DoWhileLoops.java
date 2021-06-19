package loops;
import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int lastdigit, SumOfDigits=0;
		while(temp != 0) {
	lastdigit = temp%10;
	SumOfDigits += lastdigit;
	temp /= 10;	}
		System.out.println(SumOfDigits);

	}

}
