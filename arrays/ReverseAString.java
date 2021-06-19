package arrays;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a = " The sky is Blue ";
String b =  reverseWords(a);
System.out.println(b);
 
  
 
   }
	 public static String reverseWords(String a1){
		  String ans = "";
		  int i = a1.length()-1;
		  while( i>=0) {
			  while(i>=0&& a1.charAt(i)==' ') i--;
			  int j = i;
			  while(i>=0&& a1.charAt(i)!= ' ') i--;
			  
			  ans= ans.concat(" " + a1.substring(i+1,j+1));
			   }return ans;
		  }

}
