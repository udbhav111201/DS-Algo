package loops;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(int i=1; i<=n; i++) {
	   for (int j = 1; j<= n;j++) {
		   int a = j;
		   int b = i;
//		   if(j<i)System.out.print("  ");
//		   else System.out.print("* ");
		   a<b?{System.out.println("  ");}:System.out.println("* ");
	   } System.out.println();
   }

	}

}
