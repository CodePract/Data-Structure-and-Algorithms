/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class CircularLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Generic CircularLinkedList Example..");
		CircularLinkedList<Object> cl = new CircularLinkedList<Object>();
		
		cl.insertFirst(1);
		cl.insertFirst(2);
		cl.insertFirst("A");
		cl.insertFirst(4);
		cl.insertLast("B");
		cl.insertLast(6);
		
		cl.print();
		
		cl.deleteFirst();
		cl.print();
		cl.deleteFirst();
		cl.print();

	}


}
