package que;

import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(25);
		que.add(35);
		que.add(36);
		 System.out.println(que);
		
		 que.remove();
		 que.remove();
		 que.remove();
		 que.poll();
	}

}
