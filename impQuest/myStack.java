package impQuest;

import java.util.Stack;

public class myStack {
	
	 public static char func(char c){
		 char temp = 0 ;
         if(c == '[' ){  temp = ']'; }
         else if(c == '{' ){ temp = ')';}
         else if(c == '(' ){ temp = '}'; }
    return temp;         }
	
	 static boolean ispar(String x)
	    {
		   boolean temp = false;
	        Stack<Character> sS = new Stack<>();
	      
	            
	            for(int i=0;i< x.length();i++)
	        { if(x.charAt(i)== '[' || x.charAt(i)== '(' || x.charAt(i)== '{' ){ 
	                sS.push(x.charAt(i));}
	                else if ((x.charAt(i)== ']' || x.charAt(i)== ')' || x.charAt(i)== '}')&& func(x.charAt(i))==sS.peek() )
	    {sS.pop(); }else{temp = false;}
	    }
	    if (sS.size() == 0) temp = true;
	            return temp;}

}
