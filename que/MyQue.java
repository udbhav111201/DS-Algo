package que;
import LinkeList.MyLinkedList.Node;
public class MyQue<E> {
	public Node<E> head, rear;
	
	public void Enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		
	if(head == null) { head = rear = toAdd;}
	else {
	 rear.next= toAdd;
	rear = rear.next;
	     }
	}
	
	public E Dequeque() {
		
		if(head == null) {
			return null;
		}
        if(head.next == null) {
			Node<E> temp = head;
			head = rear = null; //as head will already be null and the head and rear were equal, 
			return temp.data;  // so if list empty, rear has to be zero 
			
		}
		Node<E> temp = head;
		head = head.next;
		return temp.data;
	}
	

	}


