package scannerUserInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int principal = sc.nextInt();
          float rate = sc.nextFloat();
          int time= sc.nextInt();
          double interest = principal*rate*time/100;
          System.out.print(interest+" percent per annum will applied for your amount");
          
          
	}

}
