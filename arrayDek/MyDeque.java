package arrayDek;

public class MyDeque<E> {
	
	public Node<E> head, tail;
	public void addFirst(E e) {
 Node<E> toAdd = new Node<>(e);
		if(head==null) {
			head= tail = toAdd;
		}
		else {head.next = toAdd;
		 toAdd.prev = head;
		 head=head.next;
			}
		}
public E removeLast() {
	if(head==null) {
		return null;
	}
	Node<E> toRemove = tail;
	tail=tail.next;
	tail.prev=null;
	toRemove.next = null;
	
	if(tail==null){
		head = tail = null;
	}return toRemove.data;
	}
	
public static class Node<E>{
	E data;
	Node<E> next, prev;
	Node(E data){
		this.data = data;
		this.next= this.prev = null;}
	}
}
