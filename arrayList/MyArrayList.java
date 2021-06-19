package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> member = new ArrayList<>();
		List<String> member2 = new LinkedList<>();
		member2.add("aaja");
		member2.add("tujhko");
		member2.add("pookare");
		
		 member.add("Suraj");
		 member.add("Chanda");
		 member.add("kahoon");
		 
		 member.addAll(member2);
		 String temp[] = new String[member.size()];
		    
		 member.toArray(temp);
		 
		 System.out.println(member);
		 
		
	
	}

}
