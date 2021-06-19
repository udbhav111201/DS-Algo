package LinkeList;

import java.util.*;

public class MyLinkedList<E> {
	
	
 public static class Node<E>{
	public E data;
	public Node<E> next;
	
	public Node(E data) {
		this.data = data;
		next = null;
		}
	}
Node<E> head;
public void add( E e) {
	 Node<E>  toAdd = new Node<E>(e);
	  Node<E> temp = head;
	  
	 if(isEmpty()) {
		 head = toAdd;
		 return;
	 }
	 
	   
	  while(temp.next != null)
	  { temp = temp.next;
		  }
	  temp.next = toAdd;
 }

public E removeLast() throws Exception {
	 Node<E> temp = head;
	 if(temp==null) {
		 throw new Exception (" field is null , nothing can be removed");
		 
	 }
	 if(temp.next== null) {
		Node<E> toRemove = temp;
		temp = null;
		return toRemove.data;
	 }
	 while(temp.next.next != null) {
		 temp= temp.next;}
	 Node<E> toRemove = temp.next;
	 temp.next = null;
	 return toRemove.data;}
        
 public boolean isEmpty() {
	 return head==null;
 }
 
 public E getLast() throws Exception{
	 Node<E> temp = head;
	 if(temp==null) {
		 throw new Exception("cannot get element from an empty list");
		 }
	 while(temp.next!=null) {
		 temp = temp.next;
	 }
	 return temp.data;
 }
 
 void print() {
	 Node<E> temp = head;
	 while(temp != null) {
  System.out.print(temp.data +" ");
  temp = temp.next;
	 }
}
}

	


