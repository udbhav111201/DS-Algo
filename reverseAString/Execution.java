package reverseAString;

public class Execution {
	
	public class ReverseWords {
		public String reversesTring (String s) {
			 String ans = "";
			 int i = s.length()-1;
			 while (i>=0)
			 {while (i>=0 && s.charAt(i) == ' ')	i--;
			 int j = i;
			 if( i<0) break;
			 while(i>=0 && s.charAt(i)!=' ')i--;
			 if(ans.isEmpty()) {ans = ans.concat(s.substring(i+1,j+1));}
			 else {ans= ans.concat(" "+ s.substring(i+1,j+1));}
			 } 
			 return ans;}

	}

	public static void main(String[] args) {

 String solo = "The Sky Is Blue";
 String mine =reversesTring (solo);
 System.out.println(mine);}
    
 private static String reversesTring(String solo) {
		 String ans = "";
		 int i = solo.length()-1;
		 while (i>=0)
		 {while (i>=0 && solo.charAt(i) == ' ')	i--;
		 int j = i;
		 if( i<0) break;
		 while(i>=0 && solo.charAt(i)!=' ')i--;
		 if(ans.isEmpty()) {ans = ans.concat(solo.substring(i+1,j+1));}
		 else {ans= ans.concat(" "+ solo.substring(i+1,j+1));}
		 } 
		 return ans;
	}}


