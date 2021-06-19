package vectors;

import LinkeList.MyLinkedList;

public class MyStack<E> {
	MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e){
		 ll.add(e);
		 }
    E peek() throws Exception{
    	if(ll.isEmpty()) {
  		  throw new Exception("peeking out not possible as the stack is empty");}
    	return ll.getLast();
    	  
      }
      
      E pop() throws Exception{
    	  if(ll.isEmpty()) {
    		  throw new Exception("popping out not possible as the stack is empty");
    	  }
    	  return ll.removeLast();
    	  
      }
}
