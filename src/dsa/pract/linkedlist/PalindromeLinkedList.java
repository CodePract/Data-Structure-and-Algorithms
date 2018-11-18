/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

import java.util.Stack;

/**
 *
 * @author CodePract
 *
 */
public class PalindromeLinkedList {

	/*
	 * Method : 1 - Using stack 
	 * using stack is not good because it takes extra space
	 */
	
	public static boolean isPalindromeByStack(Node<String> head){
		Stack<Node<String>> stack = new Stack<Node<String>>();
		Node<String> tmp = head;
		boolean isPalindrome = true;
		while(tmp != null){
			stack.add(tmp);
			tmp = tmp.getNext();
		}
		
		while(head != null){
			if(head.getData() != stack.pop().getData()){
				isPalindrome = false;
				break;
			}
			head = head.getNext();
		}
		return isPalindrome;
	}
	
	/*
	 * Method 2
	 */
	
	public static Node<String> reverse(Node<String> head){
		Node<String> prev = null;
		Node<String> current = head;
		Node<String> next = null;
		
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static boolean compare(Node<String> head1,Node<String> head2){
		Node<String> tmp1 = head1;
		Node<String> tmp2 = head2;
		
		while(tmp1 != null && tmp2 != null){
			if(tmp1.getData() != tmp2.getData()){
				return false;
			}
			tmp1 = tmp1.getNext();
			tmp2 = tmp2.getNext();
		}
		return true;
	}
	
	public static boolean isPalindromeBy2Halve(Node<String> head){
		Node<String> slowP = head,fastP = head,prevSlowP = head;
		Node<String> midP = null;
		boolean result = true;
		
		if(head != null && head.getNext() != null){
			while(fastP != null && fastP.getNext() != null){
				fastP = fastP.getNext().getNext();
				prevSlowP = slowP;
				slowP = slowP.getNext();
			}
			
			if(fastP != null){
				midP = slowP;
				slowP = slowP.getNext();
			}
			
			prevSlowP.setNext(null);
			slowP = reverse(slowP);
			result = compare(head, slowP);
			slowP = reverse(slowP);
			if(midP != null){
				prevSlowP = midP;
				midP.setNext(slowP);
			}
			else{
				prevSlowP.setNext(slowP);
			}
		}
		
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SinglyLinkedList<String> ll = new SinglyLinkedList<String>();
		
		ll.insertAtEnd("M");
		ll.insertAtEnd("A");
		ll.insertAtEnd("D");
		ll.insertAtEnd("A");
		ll.insertAtEnd("M");
		
		System.out.println("Using Stack");
		if(isPalindromeByStack(ll.head)){
			System.out.println("Yes!, Linkedlist is palindrome");
		}
		else{
			System.out.println("No, Linkedlist is not palindrome");
		}
		
		System.out.println("Using 2 Halves");
		if(isPalindromeBy2Halve(ll.head)){
			System.out.println("Yes!, Linkedlist is palindrome");
		}
		else{
			System.out.println("No, Linkedlist is not palindrome");
		}
	}

}
