package arrays;
import java.util.Scanner;
public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for first Matrix");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		System.out.println("Enter the number of rows and columns for second Matrix");
		int rows2 = sc.nextInt();
		int columns2 = sc.nextInt();
		int first[][] = new int[rows][columns];
		int second[][]= new int[rows2][columns2];
				if(columns!= rows2) {System.out.println("The multiplication is not feasible");
				}else {
		System.out.println("Enter the elements of first Matrix");	
		for(int i = 0; i<rows; i++) {
			for (int j = 0;j< columns;j++)
				first[i][j] = sc.nextInt();}
		System.out.println("Enter the elements of Second Matrix");	
			for(int i = 0; i<rows2; i++) {
				for (int j = 0;j< columns2;j++)
					second[i][j] = sc.nextInt();}
			int result[][] = new int[rows][columns2];
			for(int i =0;i<rows;i++ ) {
				for(int k=0;k<columns2;k++) {
					result[i][k] = 0;
				for (int j =0; j<columns;j++) {
					result[i][k] += first[i][j]*second[j][k];}
					System.out.print(result[i][k]+" ");} System.out.println();}
		
			}
		}
		

	}


