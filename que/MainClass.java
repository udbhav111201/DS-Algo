package que;

import LinkeList.MyLinkedList;
import que.MyQue;

public class MainClass {

	public static void main(String[] args) {
	
		MyQue<Integer> que = new MyQue<>();
		que.Enqueue(12);
		que.Enqueue(132);
		que.Enqueue(312);
		que.Enqueue(123);
		
	System.out.println(que.Dequeque());
	System.out.println(que.Dequeque());
	System.out.println(que.Dequeque());
	System.out.println(que.Dequeque());
	System.out.println(que.Dequeque());
	
	que.Enqueue(1432);
	System.out.println(que.Dequeque());
		
	}

}
