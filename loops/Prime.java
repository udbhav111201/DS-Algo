package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 boolean isprime = true;
		 for(int i=2;i*i<=a;i++) {
			 if(a%i==0) {
				 isprime = false;
				 break;
			 }}
			 if (a<2)
				 isprime = false;
			 if(isprime == true){System.out.println("number is prime");}else
				 System.out.println("number is not prime");}

	}


