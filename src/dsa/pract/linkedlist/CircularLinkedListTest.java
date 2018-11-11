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
		
		cl.insertFirst(new Node<Object>(1, null));
		cl.insertFirst(new Node<Object>(2, null));
		cl.insertFirst(new Node<Object>("A", null));
		cl.insertFirst(new Node<Object>(4, null));
		cl.insertLast(new Node<Object>("B", null));
		cl.insertLast(new Node<Object>(6, null));
		
		cl.print();
		
		cl.deleteFirst();
		cl.print();
		cl.deleteFirst();
		cl.print();

	}


}
