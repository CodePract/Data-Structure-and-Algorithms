/**
 * CodePract by TheDeveloper
 */
package dsa.pract.linkedlist;

/**
 *
 * @author CodePract
 *
 */
public class CountOccurance {
	
	static int globleCount = 0;

	/**
	 * 
	 * @param ll
	 * @param key
	 * @return count
	 * 
	 * using iterative method
	 */
	public static int count(Node<Integer> head,int key){
		if(head == null){
			return 0;
		}
		int count = 0;
		do{
			if(head.getData() == key){
				count++;
			}
			head = head.getNext();
		}while(head != null);
		return count;
	}
	
	public static int recCount(Node<Integer> head,int key){
		if(head == null){
			//to set globle count back to zero 
			int tmpRet = globleCount;
			globleCount = 0;
			return tmpRet;
		}
		if(head.getData() == key){
			globleCount++;
		}
		return recCount(head.getNext(), key);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(1);
		ll.insertAtEnd(4);
		ll.insertAtEnd(2);
		ll.insertAtEnd(1);
		
		System.out.println("By Iterative : Number of Occurance of 1 is "  + count(ll.head,1));
		System.out.println("By Recursive : Number of Occurance of 1 is "  + recCount(ll.head,1));
	}

}
