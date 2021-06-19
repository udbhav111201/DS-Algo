package arrays;
import java.util.Scanner;

public class AnagramSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word to be checked");
		String a = sc.nextLine();
		String b = sc.nextLine();
	    int asKey[]= new int[256];
	    for(char c: a.toCharArray()) {
	    	int index = (int)c;
	    	++asKey[index];
	    }
		for(char c: b.toCharArray()) {
		 int index = (int)c;
			--asKey[index];
			}
		    boolean t= true;
		for (int i=0;i<256;i++) {
			 t = (asKey[i]== 0);
			if(!t) { System.out.println("this is not an anagram");
			break;
			}
		}   
		if(t == true)System.out.println("these are anagrams");
     }}


