package dsa.pract.recursive_backtracking;
/**
 * @author KMEVADA
 *
 */
public class TowerOfHanoi {

	public static void solve(int disk,char from,char to,char aux){
		if(disk == 1){
			System.out.println("Moving disk 1 " + from + " to " + to);
			return;
		}
		solve(disk-1, from, aux, to);
		System.out.println("Moving disk " + disk + " "+ from + " to " + to);
		solve(disk-1, aux, to, from);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(5, 'A', 'B', 'C');
	}

}
