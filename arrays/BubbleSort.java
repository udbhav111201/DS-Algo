package arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the list");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
       int marks[] = new int[n];
       System.out.println("Enter the marks "); 
       for(int i=0;i<n;i++) {marks[i]= sc.nextInt();}
       boolean sorted = true;
       for(int i=1;i<=n-1;i++) { for(int j=1;j<=n-1-i;j++)
       {if (marks[j-1] > marks[j]) {int temp = marks[j-1];
         marks[j-1]= marks[j];
           marks[j]= temp;  sorted = false;} }
       if (sorted) break;
       } 
       for(int item: marks) {System.out.print(item +" ");
       }
 
	}}


