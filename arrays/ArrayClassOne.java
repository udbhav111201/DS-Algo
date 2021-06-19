package arrays;
import java.util.Scanner;

public class ArrayClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		System.out.println("Enter the marks of these students");
	   int marks[] = new int[5];
	   int averageMarks = 0; 
		for (int i=0;i<n;i++) {
              marks[i]	= sc.nextInt();	
              averageMarks += marks[i];
		}
		averageMarks /= n;
		System.out.println("Average marks of" + n +" students is " + averageMarks);
		

	}

}
