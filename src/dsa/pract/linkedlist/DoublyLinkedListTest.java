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
		dl.insertFirst(new DLLNode<Object>(5, null, null));
		dl.insertLast(new DLLNode<Object>(4, null, null));
		dl.insertAtPos(new DLLNode<Object>(10, null, null), 2);
		dl.insertAtPos(new DLLNode<Object>("Hello", null, null), 3);
		
		dl.print();
		
		dl.deleteAtPos(2);
		dl.print();
		dl.deleteAtPos(2);
		dl.print();
		dl.deleteAtPos(2);
		dl.print();
		dl.deleteAtPos(2);
		dl.print();
		dl.deleteAtPos(2);
		dl.print();
	 
	}
}
