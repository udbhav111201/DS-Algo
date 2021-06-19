package arrays;
import java.util.Scanner;
public class SeriesSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of marks");
		int n = sc.nextInt();
		int marks[]= new int[n];
		System.out.println("Enter the marks ");
		for(int i=0;i<n;i++) { marks[i]= sc.nextInt();}
		for (int i=0;i<n-1;i++) {
			int MinIndex = i;
			for(int j=i;j<=n-1;j++)
			{ if (marks[MinIndex]> marks[j]) {
			int temp = j;
			j = MinIndex;
			MinIndex= temp;}} 
			int tempo = marks[i];
		marks[i] = marks[MinIndex];
		marks[MinIndex]= tempo;}
		for(int item:marks) {System.out.print(item + " ");
			}
		

	}

}
