/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class DoublyCircularLinkedListTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Generic DoublyCircularLinkedList Example..");
		
		DoublyCircularLinkedList<Integer> cl = new DoublyCircularLinkedList<Integer>();
		
		cl.insertFirst(1);
		cl.insertFirst(2);
		cl.insertFirst(3);
		cl.insertFirst(4);
		cl.print();
		cl.insertLast(5);
		cl.insertLast(6);
		cl.insertLast(7);
		cl.print();
		
		cl.deleteFirst();
		cl.print();
		
		cl.deleteLast();
		cl.deleteLast();
		cl.print();
		
		System.out.println("Length of List by iterative -> " + new LengthOfLinkedList<Integer>().findLength(cl.tail,cl.tail));
		System.out.println("Length of List by recursive -> " + new LengthOfLinkedList<Integer>().findLengthByRec(cl.tail,cl.tail));
	}

}
