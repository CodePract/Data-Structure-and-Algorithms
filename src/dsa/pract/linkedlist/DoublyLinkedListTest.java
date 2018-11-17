/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class DoublyLinkedListTest {
	public static void main(String[] args){
		System.out.println("Generic DoublyLinkedList Example");
		DoublyLinkedList<Object> dl = new DoublyLinkedList<Object>();
		dl.insertFirst(5);
		dl.insertLast(4);
		dl.insertAtPos(10, 2);
		dl.insertAtPos("Hello", 3);
		
		dl.print();
		
		dl.deleteAtPos(2);
		dl.print();
	 
		System.out.println("Length of List by iterative -> " + new LengthOfLinkedList<Object>().findLength(dl.head,dl.head));
		System.out.println("Length of List by recursive -> " + new LengthOfLinkedList<Object>().findLengthByRec(dl.head,dl.head));
	}
}
