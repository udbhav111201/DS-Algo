package switchCase;
     import java.util.Scanner;
public class OperatorCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		sc.nextLine();
		char siGn = sc.nextLine().charAt(0);
		switch (siGn) {
		case '+' : System.out.println(a+b);
		break;
		case'-' : System.out.println(a-b);
		break;
		case'/': System.out.println(a/b);
		break;
		case '*' : System.out.println(a*b);
		break;
		default: System.out.println("Enter the valid operation ");

		}

	}

}
