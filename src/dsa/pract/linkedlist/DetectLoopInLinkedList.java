/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

import java.util.HashSet;

/**
 *
 * @author CodePract
 *
 */
public class DetectLoopInLinkedList {

	/**
	 * detect loop using Hashset
	 *
	 */
	
	public static boolean detectLoopByMap(Node<Integer> head){
		if(head == null){
			return false;
		}
		HashSet<Node<Integer>> hash = new HashSet<Node<Integer>>();
		
		while(head != null){
			if(hash.contains(head)){
				return true;
			}
			hash.add(head);
			head = head.getNext();
		}
		return false;
	}
	
	/**
	 * Floyds Cycle finding Algorithms
	 * @param head
	 * @return
	 * 
	 * Time Complexity: O(n)
	 * Auxiliary Space: O(1)
	 */
	public static boolean detectLoopByFCF(Node<Integer> head){
		if(head == null){
			return false;
		}
		Node<Integer> slowPointer = head;
		Node<Integer> fastPointer = head;
		
		while(fastPointer != null && fastPointer.getNext() != null && fastPointer.getNext().getNext() != null){
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			if(slowPointer == fastPointer){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		ll.insertAtEnd(10);
		ll.insertAtEnd(4);
		ll.insertAtEnd(15);
		ll.insertAtEnd(20);
		ll.insertAtEnd(25);
		
		ll.head.getNext().getNext().getNext().getNext().setNext(ll.head.getNext());
		
		
		System.out.println("Detect loop using Hashset");
		if(detectLoopByMap(ll.head)){
			System.out.println("Yes, Loop is detected");
		}
		else{
			System.out.println("No, Loop is not detected");
		}
		
		System.out.println("Detect loop using Floyds Cycle finding Algorithms");
		if(detectLoopByFCF(ll.head)){
			System.out.println("Yes, Loop is detected");
		}
		else{
			System.out.println("No, Loop is not detected");
		}
		
	}

}
