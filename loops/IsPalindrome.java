package loops;
import java.util.Scanner;
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int reverseDigitNumber= 0;
int temp = n;
int lastDigit;
 while(temp != 0) {
	 lastDigit = temp%10;
			 reverseDigitNumber = reverseDigitNumber*10 + lastDigit;
			 temp /= 10;
 }
 if(n==reverseDigitNumber)System.out.println("number is Palindrome");else
	 System.out.println("nmber is not Palindrome");
	}

}
