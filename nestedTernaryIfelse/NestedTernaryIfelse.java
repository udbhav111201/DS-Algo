package nestedTernaryIfelse;
   import java.util.Scanner;
public class NestedTernaryIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		double result = (a>b?a>c?a:c:b>c?b:c);
		System.out.println(result);
		

	}

}
